// setup ui
const loggedOutLinks = document.querySelectorAll('.logged-out');
const loggedInLinks = document.querySelectorAll('.logged-in');
const accountDetails = document.querySelector('.account-details');
const verifiedItems = document.querySelectorAll('.verified');
const notverifiedItems = document.querySelectorAll('.not-verified');
const userItems = document.querySelector('.users');
const ownerItems = document.querySelector('.owner-field');

const setupUI = (user) => {
    if(user) {
        if(user.emailVerified){
            verifiedItems.forEach(item => item.style.display = 'block');
            notverifiedItems.forEach(item => item.style.display = 'none');
        } else {
            verifiedItems.forEach(item => item.style.display = 'none');
            notverifiedItems.forEach(item => item.style.display = 'block');
        }

        // account info
        const html = `<div class="small-2 columns"><img src="${user.photoURL}"/></div>
            <div class="small-10 columns">${user.displayName}<br>
            ${user.email}<br>
        `;
        accountDetails.innerHTML = html;
        // toggle UI elements
        loggedInLinks.forEach(item => item.style.display = 'block');
        loggedOutLinks.forEach(item => item.style.display = 'none');
    } else {
        // hide account info
        accountDetails.innerHTML = 'Je moet ingelogd zijn om deze pagina te bekijken';

        // toggle UI elements
        loggedInLinks.forEach(item => item.style.display = 'none');
        loggedOutLinks.forEach(item => item.style.display = 'block');
        adminItems.forEach(item => item.style.display = 'none');
    }
};


const setupUsers = (err, data) => {
    if(err) {
        console.log(err);
    } else {
        let users = eval('(' + data + ')')._embedded.userDtoList;
        console.log(users);
        if (users.length) {
            document.getElementsByClassName("sign-up")[0].style.display = 'block';
            let html = '<ul>';
            users.forEach(user => {
                user.id = user._links.self.href.charAt(user._links.self.href.length - 1);
                const li = `
            <li>
                <div>${user.username}</div><div><a onclick="makeUserType(${user.id}, "ROLE_SUPER_USER")">Make super user</a></div><div><a onclick="makeUserType(${user.id}, "ROLE_USER")">Make user</a></div>
            </li>
           `;
                html += li;
            });
            html += '</ul>';
            userItems.innerHTML = html;
        } else {
            document.getElementsByClassName("sign-up")[0].style.display = 'none';
            userItems.innerHTML = 'Geen rechten oid';
        }
    }
};

const setupOwners = (err, data) => {
    if(err) {
        console.log(err);
    } else {
        let owners = eval('(' + data + ')')._embedded.ownerDtoList;
        if(owners.length) {
            let html = '<select name="signup-owner">';

            owners.forEach(owner => {
                const option = `
                <option value="${owner.code}">${owner.name}</option>
                `
                html += option;
            });

            html += '</select>';
            ownerItems.innerHTML = html;
        }
    }
};

const makeUserType = (id, role) => {
    let url = 'http://localhost:5000/aa/users/' + id + '/roles/' + role;
    UserAction('PUT', url, myLog);
};
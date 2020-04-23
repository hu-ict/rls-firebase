// Facebook
const facebookAuthProvider = new firebase.auth.FacebookAuthProvider();
const facebookLogin = document.querySelector('.facebook');
facebookLogin.addEventListener('click', (e) => {
    e.preventDefault();
    auth.signInWithPopup(facebookAuthProvider).then(result => {
        if (result.additionalUserInfo.isNewUser) {
            //delete the created user
            result.user.delete();
        } else {
            // your sign in flow
            signup(result.user, 0);
        }



        document.querySelector('.facebook-error').innerHTML = '';
    }).catch(err => {
        document.querySelector('.facebook-error').innerHTML = err.message;
    });
});

// Google
const googleAuthProvider = new firebase.auth.GoogleAuthProvider();
const googleLogin = document.querySelector('.google');
googleLogin.addEventListener('click', (e) => {
    e.preventDefault();
    auth.signInWithPopup(googleAuthProvider).then(function(result) {
        if (result.additionalUserInfo.isNewUser) {
            //delete the created user
            result.user.delete();
        } else {
            // your sign in flow
            signup(result.user, 0);
        }

        document.querySelector('.google-error').innerHTML = '';
    }).catch(function(err) {
        document.querySelector('.google-error').innerHTML = err.message;
    });
});



// listen for auth status changes
auth.onAuthStateChanged(user => {
    if(user){
        user.getIdTokenResult().then(idTokenResult => {
            let url = 'http://localhost:5000/aa/users/';
            let url2 = 'http://localhost:5000/aa/owners/';
            UserAction("GET", url, setupUsers);
            UserAction("GET", url2, setupOwners);
            setupUI(user);

        });
    } else {
        setupUI();
    }
});

// signup
const signupForm = document.querySelector('#signup-form');
signupForm.addEventListener('submit', (e) => {
    e.preventDefault();

    // get user info
    const email = signupForm['signup-email'].value;
    const password = signupForm['signup-password'].value;
    let ownerCode = "getFromUser";
    console.log(signupForm['signup-owner']);
    if(signupForm['signup-owner']) {
        ownerCode = signupForm['signup-owner'].value;
    }

    // sign up user
    secondaryApp.createUserWithEmailAndPassword(email, password).then(cred => {
        cred.user.sendEmailVerification();

        signup(cred.user, ownerCode);

        secondaryApp.signOut();

        signupForm.reset();
        signupForm.querySelector('.signup-error').innerHTML = '';
    }).catch(err => {
        signupForm.querySelector('.signup-error').innerHTML = err.message;
    });
});

// logout
const logout = document.querySelector('#logout');
logout.addEventListener('click', (e) => {
    e.preventDefault();
    document.getElementsByClassName("sign-up")[0].style.display = 'none';
    auth.signOut();
});

// resend email
const resend = document.querySelector('#resend');
resend.addEventListener('click', (e) => {
    e.preventDefault();
    auth.currentUser.sendEmailVerification();
});

// login
const loginForm = document.querySelector('#login-form');
loginForm.addEventListener('submit', (e) => {
    e.preventDefault();

    // get user info
    const email = loginForm['login-email'].value;
    const password = loginForm['login-password'].value;

    auth.signInWithEmailAndPassword(email, password).then(cred => {
        loginForm.reset();
        loginForm.querySelector('.login-error').innerHTML = '';
    }).catch(err => {
        loginForm.querySelector('.login-error').innerHTML = err.message;
    });
});



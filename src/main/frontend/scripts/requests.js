function UserAction(method, url, callback) {
    auth.currentUser.getIdToken(true).then(function(idToken) {
        let xhr = new XMLHttpRequest();

        xhr.onreadystatechange = function() {
            if (this.readyState == 4) {
                if(this.status == 200) {
                    return callback(null, this.response);
                    // return this.responseText;
                } else {
                    return callback(this.statusText);
                }
            }
        };
        xhr.open(method, url, false);
        xhr.setRequestHeader("Content-type", "application/json");
        xhr.setRequestHeader("token", idToken);

        xhr.send();
    }).catch(function(error) {
        console.log(error);
    });
}

function signup(user, ownerCode) {
    let url = "http://localhost:5000/sign-up/" + encodeURI(user.email);
    let xhr = new XMLHttpRequest();

    xhr.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            let url = 'http://localhost:5000/aa/users/';
            UserAction("GET", url, setupUsers);
        }
    };
    auth.currentUser.getIdToken(true).then(function(idToken) {
        xhr.open("PUT", url, true);
        xhr.setRequestHeader("Content-type", "application/json");
        xhr.setRequestHeader("token", idToken);
        let params = {
            "email" : user.email,
            "firstName" : user.email,
            "lastName" : user.email,
            "uid" : user.uid,
            "ownerCode" : ownerCode
        };
        xhr.send(JSON.stringify(params));
    }).catch(function(error) {
        console.log(error);
    });
}

function myLog(err, data) {
    if(err){
        console.log(err);
    } else {
        console.log(data);
    }
}
// forgot password
const forgotPasswordForm = document.querySelector('#forgot-password-form');
forgotPasswordForm.addEventListener('submit', (e) => {
    e.preventDefault();

    // get user info
    const email = forgotPasswordForm['forgot-password-email'].value;

    // sign up user
    auth.sendPasswordResetEmail(email);
});
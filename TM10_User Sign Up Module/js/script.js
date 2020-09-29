let dateTime = new Date();
let date = "Current Date: " + dateTime.getDate() + "-" + dateTime.getMonth() + "-" + dateTime.getFullYear();
let time = "Current Time: " + dateTime.getHours() + ":" + dateTime.getMinutes() + ":" + dateTime.getSeconds();
const dt = document.querySelector("#dateTime");
dt.innerHTML = `${date}<br>${time}`;
setInterval(updateDateTime,1000);
setTimeout(pastTime, 180000);
function pastTime() {
    alert("3 Mins Past"); 
}
function updateDateTime()
{
    dateTime = new Date();
    date = "Current Date: " + dateTime.getDate() + "-" + dateTime.getMonth() + "-" + dateTime.getFullYear();
    time = "Current Time: " + dateTime.getHours() + ":" + dateTime.getMinutes() + ":" + dateTime.getSeconds();
    dt.innerHTML = `${date}<br>${time}`;
}
function validate() {
    let fn = document.getElementById('fn').value;
    let ln = document.querySelector('#ln').value;
    let pwd = document.querySelector('#pwd').value;
    let cpwd = document.querySelector('#cpwd').value;
    let mobno = document.querySelector('#mobno').value;
    let dob = document.querySelector('#dob').value;
    let email = document.querySelector('#email').value;
    let gender = document.getElementsByName('gender');
    let formValid = false;
    if (fn.length < 1) {
        alert("First Name must be entered");
        document.querySelector('#fn').focus();
    }
    else if (!checkChars(fn)) {
        alert("Only characters must be entered in First Name");
        document.querySelector('#fn').focus();
    }
    else if (ln.length < 1) {
        alert("Last Name must be Entered");
        document.querySelector('#ln').focus();
    }
    else if (!checkChars(ln)) {
        alert("Only characters must be entered in Last Name");
        document.querySelector('#ln').focus();
    }
    else if (pwd.length < 1) {
        alert("Password must be Entered");
        document.querySelector('#pwd').focus();
    }
    else if (pwd.length < 6 || pwd.length > 20) {
        alert("Password Length must be between 6 to 20 characters");
        document.querySelector('#pwd').focus();
    }
    else if (cpwd.length < 1) {
        alert("Confirm Password must be Entered");
        document.querySelector('#cpwd').focus();
    }
    else if (!(cpwd === pwd)) {
        alert("Password and Confirm Password must be same");
        document.querySelector('#cpwd').focus();
    }
    else if (!(gender[0].checked || gender[1].checked)) {
        alert("Gender must be Selected");
        document.querySelector('#male').focus();
    }
    else if (mobno.length < 1) {
        alert("Mobile Number must be entered");
        document.querySelector('#mobno').focus();
    }
    else if (verifyMobileFormat(mobno)) {
        alert("Mobile Number must be in any of the specified formats\n1. XXX-XXX-XXXX\n2. XXX.XXX.XXXX\n3. XXX XXX XXXX");
        document.querySelector('#mobno').focus();
    }
    else if (dob.length < 1) {
        alert("Date of Birth must be Entered");
        document.querySelector('#dob').focus();
    }
    else if (verifyDOBFormat(dob)) {
        alert("Date of Birth must be Entered in Specified Format\n1. DD-MM-YYYY");
        document.querySelector('#dob').focus();
    }
    else if (email.length < 1) {
        alert("Email Id must be Entered");
        document.querySelector('#email').focus();
    }
    else if (verifyEmailFormat(email)) {
        alert("Email Id must be entered in specified Format\nsomename@example.com");
        document.querySelector('#email').focus();
    }
    else {
        formValid = true;
    }
    return formValid;
}
function checkChars(word) {
    for (let i = 0; i < word.length; i++) {
        console.log("In");
        if (!isNaN(word.charAt(i))) {
            return false;
        }
    }
    return true;
}
function verifyMobileFormat(phno) {
    let ph = [/\d{3}[-]{1}\d{3}[-]{1}\d{4}/,/\d{3}[.]{1}\d{3}[.]{1}\d{4}/,/\d{3}[ ]{1}\d{3}[ ]{1}\d{4}/];
    let phValid = (ph[0].test(phno) || ph[1].test(phno) || ph[2].test(phno));
    return !phValid;
}
function verifyDOBFormat(dat) {
    let df = /\d{1,2}[-]{1}\d{1,2}[-]{1}\d{4}/;
    let datValid = df.test(dat);
    let validDOB = false;
    if(datValid) {
        let dmy = dat.split("-");
        dmy[0] = parseInt(dmy[0]);
        dmy[1] = parseInt(dmy[1]);
        dmy[1] = parseInt(dmy[1]);
        if((dmy[0]>0&&dmy[0]<32)&&(dmy[1]>0&&dmy[1]<13)&&(dmy[2]>1900&&dmy[2]<=dateTime.getFullYear())) {
            if(!(dmy[1] === 1 || dmy[1] === 3 || dmy[1] === 5 || dmy[1] === 8 || dmy[1] === 10 || dmy[1] === 12))
            {
                if(dmy[1] === 2)
                {
                    if(dmy[2]%4 ===0 && dmy[1] <= 29)
                    {
                        validDOB = true;
                    }
                    else if(dmy[0]<29)
                    {
                        validDOB = true;
                    }
                }
                else if(dmy[0]<31) {
                    validDOB = true;
                }
            }
            else {
                validDOB = true;
            }
        }
    }
    return !validDOB;
}
function verifyEmailFormat(mail) {
    let em = /[\d | \D]{1,}[@]{1}[a-zA-Z]{1,}[.]{1}[a-zA-Z]{1,}/;
    let emValid = em.test(mail);
    return !emValid;
}
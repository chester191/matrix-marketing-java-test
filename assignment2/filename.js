function EmailValidation(enteredEmail){

	var mail_format = /^w+([.-]?w+)*@w+([.-]?w+)*(.w{2,3})+$/;

	if(enteredEmail.value.match(mail_format)){
		alert("Yeah! a valid email!");
		document.form1.text1.focus();
		return true;
	}
	else{
		alert("Sorry! an invalid email!");
		document.form1.text1.focus();
		return false;
	}

}

function ValidateEmail(mail) 
{
 if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(document.form1.text1.value))
  {
	alert("valid");
    return (true)
  }
    alert("You have entered an invalid email address!")
    return (false)
}
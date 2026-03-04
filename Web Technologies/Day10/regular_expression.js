var str = "S3sdhant is Ssddlk"

/*
^ -> line starting with
$ -> line ending with
. -> any character
[] -> range

+ -> ocuurance one or more time (at least one time)
* -> occurance zero to more time
{2} -> exact occurance
*/


console.log(str.match(/^S.[A-Za-h4-9]d/))
console.log(str.match(/S.+d{2}(a|y)/))
var phone = 9823223398
phone.match(/^[6-9][0-9]{9}/)
var email = "sid@cdac.com"
email.match(/^[a-zA-Z].{2}.*@[0-9a-zA-Z]+.com$/)
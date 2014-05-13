package asamaliPaketi;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Administrator
 */
public class DorgulamaSinifi {



String loginName;

String password;

String intro;

String gender;

String phone;

String address;

String city;

String state;

String country;

public String getLoginName() {

    return loginName;

}

public void setLoginName(String loginName) {

    this.loginName = loginName;

}

public String getPassword() {

    return password;

}

public void setPassword(String password) {

    this.password = password;

}

public String getIntro() {

    return intro;

}

public void setIntro(String intro) {

    this.intro = intro;

}

public String getGender() {

    return gender;

}

public void setGender(String gender) {

    this.gender = gender;

}

public String getPhone() {

    return phone;

}

public void setPhone(String phone) {

    this.phone = phone;

}

public String getAddress() {

    return address;

}

public void setAddress(String address) {

    this.address = address;

}

public String getCity() {

    return city;

}

public void setCity(String city) {

    this.city = city;

}

public String getState() {

    return state;

}

public void setState(String state) {

    this.state = state;

}

public String getCountry() {

    return country;

}

public void setCountry(String country) {

    this.country = country;

}

public void validate(HttpServletRequest request){

    String errors="";


    if(loginName ==null || loginName.trim().length() ==0){

            errors=errors+"<li>Please enter the Login Name<br>";

        }

    if(password ==null || password.trim().length() ==0){

            errors=errors+"<li>Please enter the Password<br>";

        }

    if(intro ==null || intro.trim().length() ==0){

            errors=errors+"<li>Please enter the introduction<br>";

        }

    if(gender ==null || gender.trim().length() ==0){

            errors=errors+"<li>Please select Gender<br>";

        }

    if(phone ==null || phone.trim().length() ==0){

            errors=errors+"<li>Please enter phone<br>";

        }

    if(address ==null || address.trim().length() ==0){

            errors=errors+"<li>Please enter address<br>";

        }

    if(city ==null || city.trim().length() ==0){

            errors=errors+"<li>Please enter city<br>";

        }

    if(state ==null || state.trim().length() ==0){

            errors=errors+"<li>Please enter state<br>";

        }

    if(country ==null || country.trim().length() ==0){

            errors=errors+"<li>Please enter country<br>";

        }

    if( errors.trim().length() >0){

            request.setAttribute("errors",errors);

        }

    }

}
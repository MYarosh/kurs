import React from "react";
import {connect} from "react-redux";

class LoginContainer extends React.Component{
    render() {
        return(
            <div className="main">
                <h1>Добро пожаловать на сайт</h1>

                <button className="submit-button" disabled={!this.props.formCorrect}
                        onClick={this.sendLoginRequest}>Войти</button>
                <button className="submit-button" onClick={this.redirectToRegister}>Регистрация</button>
            </div>
        )
    }
    sendLoginRequest = ()=>{
        this.props.dispatch({type:"APP_LOGIN", value:{history: this.props.history}})
    };

    redirectToRegister = ()=>{this.props.history.push("/register")};

}

const mapStateToProps = function(store) {
    return {
        user: store.appState.user,
        login: store.loginState.login,
        password: store.loginState.password,
        error: store.loginState.error,
        formCorrect: store.loginState.formCorrect
    }
};
export default connect(mapStateToProps)(LoginContainer)
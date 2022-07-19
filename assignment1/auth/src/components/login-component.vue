<template>
    <!--<form>-->
        <div class="auth-wrapper">
            <h3>Login</h3>
            <div class="auth-inner">
                <div class="form-group">
                    <label for="username">username: </label>
                    <input type="text" v-model="username" class="form-control" placeholder="username..."/>
                </div>
                <div class="form-group">
                    <label for="password">password: </label>
                    <input type="password" v-model="password" class="form-control" placeholder="password..."/>
                </div>
		<button v-on:click="login()">login</button>

            </div>
        </div>
    <!--</form>-->
</template>

<script>
    import axios from 'axios';
    import router from '@/router';
    export default {
        name: 'login-component',
        data (){
            return {
                username : '',
                password : '',
            }
        },
        methods: {
            async login(){
                // router.push({name:"about"})
                //let result = await axios.post("http://cea3-169-1-120-142.ngrok.io/user/v1/find",{
                let result = await axios.post("http://localhost:8080/user/v1/find",{
                    username:this.username,
                    password:this.password
                });
                console.log(result);
                result = JSON.jsonify(result);
                
                if(result.length>=1){
                    router.push({name:"About"})
                }
                else{
                    alert("user name or password incorrect");
                }
                console.log('login...');
                console.log(this.username,this.password);
            }
        }
    }
</script>

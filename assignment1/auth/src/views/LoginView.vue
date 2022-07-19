<template>
  <div class="login">
    <!-- <img alt="Vue logo" src="../assets/logo.png"> -->
    <LoginComponent/>
    <!-- <HelloWorld msg="Welcome to Your Vue.js App"/> -->
  </div>
</template>

<script>
// @ is an alias to /src

import LoginComponent from '@/components/login-component.vue'

export default {
    name: 'LoginView',
    components: {    
        LoginComponent
    }
}
</script>

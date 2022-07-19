<template>
  <nav>
    <router-link to="/">Home</router-link> |
    <!-- <router-link to="/about">About</router-link> | -->
    <router-link to="/login">Login</router-link>
  </nav>

  <router-view/>
</template>

<style>
  #app {
    font-family: Avenir, Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
  }

  nav {
    padding: 30px;
  }

  nav a {
    font-weight: bold;
    color: #2c3e50;
  }

  nav a.router-link-exact-active {
    color: #42b983;
  }

  .auth-wrapper{
    background-color: aqua;
    border-radius: 20px;
    height: 300px;
    width: 800px;
    margin: auto;
    padding-right: 20px;
    padding-left: 20px;
  }
  label {
    margin-left:0;
    margin-right: 93%;
  }
</style>

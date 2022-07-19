<template>
  <div class="home">
    <img alt="Vue logo" src="../assets/logo.png">
    <HomeComponent/>
    <!-- <HelloWorld msg="Welcome to Your Vue.js App"/> -->
  </div>
</template>

<script>
import HomeComponent from '@/components/home-component.vue';
// @ is an alias to /src
export default {
  name: 'HomeView',
  components: {
    HomeComponent
}
}
</script>

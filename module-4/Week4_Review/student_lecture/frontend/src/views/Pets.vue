<template>
    <div>
        <h1> {{ $store.state.user.username }}'s Pets</h1>
        <pet-display v-for="currentPet in allPets" v-bind:key="currentPet.name" v-bind:pet="currentPet"></pet-display>
        <pet-display></pet-display> 
    </div>
</template>

<script>
import PetDisplay from '@/components/PetDisplay';
export default {
    components: {
        PetDisplay
    },
    data() {
        return {
            allPets: [
                {name: 'Snowball', species: 'cat'},
                {nme: 'Blinky', species: 'fish'}
            ]
        }
    }
}
</script>

<style>

</style>
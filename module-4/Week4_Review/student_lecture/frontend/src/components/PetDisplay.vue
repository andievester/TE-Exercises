<template>
<div class="box">
    <div>{{pet.name}}</div>
    <div class="emoji">{{petEmoji}}</div>
    </div>
</template>

<script>
export default {
    props: {
        pet: Object
    },
    computed: {
        petEmoji() {
            const allEmojis = {cat: '😼', dog: '🐕‍🦺', fish: '🐟'};
            return allEmojis[this.pet.species];
        }
    }
}
</script>

<style>

</style>
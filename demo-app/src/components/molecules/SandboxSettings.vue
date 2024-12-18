<template>
    <div>
        <sbb-button @click="openOverlay" icon-name="hammer-wrench-medium" />
        <sbb-overlay ref="overlay" class="max-w-fit " accessibilitycloselabel="Close overlay"
            accessibilitybacklabel="Go back">
            <div class="text-osdm-text flex flex-col w-screen md:w-auto">
                <h1 class="self-center text-2xl mb-5">
                    Welcome to the OSDM-DEMO-APP
                </h1>
                <p class="text-md mb-5 font-normal">
                    Welcome. Below you can configure the used endpoint and user credentials within the demo.
                    You can find documentation about the authentication <a class="text-osdm-bg-primary"
                        href="https://osdm.io/spec/authentication/#jwts" target="_blank">here</a>.
                    Please enter the details of your test system or sandbox below.
                </p>
                <h2 style="margin-block-end: var(--sbb-spacing-fixed-4x)">
                    Connection details for authentication flow:
                </h2>
                <form class="flex flex-col gap-4 items-center">
                    <sbb-form-field error-space="none" size="m" class="w-64 md:w-96">
                        <label>Server base URL</label>
                        <input placeholder="https://osdm-5.platform.bileto.zone/api/" name="message"
                            v-model="serverURL" />
                    </sbb-form-field>
                    <sbb-form-field error-space="none" size="m" class="w-64 md:w-96">
                        <label>Client Id</label>
                        <input placeholder="00000-00000-00000-00000" v-model="clientId" name="message" />
                    </sbb-form-field>
                    <sbb-form-field error-space="none" size="m" class="w-64 md:w-96">
                        <label>Client Secret</label>
                        <input type="password" placeholder="0000000000" v-model="clientSecret" name="message" />
                    </sbb-form-field>
                    <sbb-button type="submit" size="m" sbb-overlay-close="" @click="handleSubmit">
                        Set Auth details
                    </sbb-button>
                </form>
            </div>
        </sbb-overlay>
    </div>
</template>

<script lang="ts">
import { useAuthStore } from '@/stores/auth';
import { osdmClientKey } from '@/types/symbols';
import { SbbOverlayElement as SbbOverlay } from '@sbb-esta/lyne-elements/overlay.js';
import { inject } from 'vue';

export default {
    components: {
        SbbOverlay,
    },
    data() {
        return {
            overlayShown: true,
            serverURL: '',
            clientId: '',
            clientSecret: '',
        }
    },
    setup() {
        const OSDM = inject(osdmClientKey)
        return { OSDM }
    },
    mounted() {
        if (useAuthStore().sandboxURL.length <= 0) {
            (this.$refs.overlay as SbbOverlay).open();
        } else {
            this.serverURL = useAuthStore().sandboxURL;
            this.clientId = useAuthStore().clientId;
            this.clientSecret = useAuthStore().clientSecret;
        }
    },
    methods: {
        openOverlay() {
            (this.$refs.overlay as SbbOverlay).open();
        },
        handleSubmit(event: Event) {
            event.preventDefault()
            useAuthStore().setAccessDetails(this.serverURL, this.clientId, this.clientSecret);
            this.OSDM?.setEndpoint(this.serverURL)
        }
    }
}
</script>
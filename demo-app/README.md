<div id="top"></div>
<!-- PROJECT SHIELDS -->
<!--
*** Using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
*** This README has been based on https://github.com/othneildrew/Best-README-Template
-->

[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Apache V2 License][license-shield]][license-url]

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://osdm.io/">
    <img src="documentation/resources/logo_osdm.png" alt="OSDM" height="80">
    <h1>OSDM Demo App</h1>
  </a>
  <p align="center">
    Happy flow demonstrator utilizing the Open Sales and Distribution Model
    <br />
    <a href="https://osdm.io/"><strong>Check the OSDM Website »</strong></a>
    <br />
  <hr />
  </p>
</div>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#setting-up-development-environment">Setting up development enviroment</a>
    </li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contributors">Contributors</a></li>
  </ol>
</details>

<!-- ABOUT THE PROJECT -->

## About The Project

To showcase the power of OSDM the Demo App aims to provide a working app to interesting parties to start implementing their apps and clients. The app covers the complete booking flow, including ancillary services, and supports trains, buses or other means of public transport.
The code found here is the second implementation based on the results of the Drei-Länder-Hack 2024. Further development includes the implementation of seat reservations and after-sales 

<p align="right">(<a href="#top">back to top</a>)</p>

### Built With

This project was build with:

[![Typescript][Typescript]][Typescript-url]
[![Vue][Vue.js]][Vue-url]
[![Tailwind][Tailwind]][Tailwind-url]
[![Vite][Vite]][Vite-url]

Utilizing [SBB-Components][Sbb-components-url]

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- USAGE EXAMPLES -->
<!--
## Usage

<p align="right">(<a href="#top">back to top</a>)</p> -->

<!-- GETTING STARTED -->

## Setting up development environment

This is a short guide to setup your own development environment of the OSDM Demo App.

1. To start of clone the Repo:

   ```sh
   $ git clone git@github.com:UnionInternationalCheminsdeFer/OSDM.git
   ```

2. Install all dependencies of the Demp App:

   ```sh
   $ cd demo-app
   $ npm install
   ```

3. Setup enviroment:

   ```sh
   $ echo VITE_REQUESTOR_HEADER=osdm_demo_app > .env
   ```

   You might set a different requestor - giving the sandbox context about the client - if needed.

4. Starting the App:
   ```sh
   $ npm run dev
   ```
   <p align="right">(<a href="#top">back to top</a>)</p>

5. Enter Sandbox credentials:

    To explore the App, a sandbox with client-id and client-secret is required (entered at the landing page of the app), you can check all available sandboxes [here][sandbox-list-url].

<!-- ROADMAP -->
## Roadmap

Potential next features include:

- [ ] Add seat reservations
- [ ] Add refund flow
- [ ] Add exchange details flow

If you consider contributing to any of these topics of want to request a feature please [open an issue](https://github.com/UnionInternationalCheminsdeFer/OSDM/issues/new/choose).


<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- LICENSE -->
## License

Distributed under the Apache V2. See the [LICENSE](../LICENSE) file for more information.

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- CONTACT -->

## Contributors

[TheNewCivilian (xatellite)](https://gitlab.com/TheNewCivilian), [schlpbch (SBB)](https://gitlab.com/schlpbch), [zdmx (xatellite)](https://gitlab.com/zdmx), [jspetrak (Bileto)](https://gitlab.com/jspetrak)

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->

[contributors-shield]: https://img.shields.io/github/contributors/UnionInternationalCheminsdeFer/OSDM.svg?style=for-the-badge
[contributors-url]: https://github.com/UnionInternationalCheminsdeFer/OSDM/contributors

[forks-shield]: https://img.shields.io/github/forks/UnionInternationalCheminsdeFer/OSDM.svg?style=for-the-badge
[forks-url]: https://github.com/UnionInternationalCheminsdeFer/OSDM/network/members

[stars-shield]: https://img.shields.io/github/stars/UnionInternationalCheminsdeFer/OSDM.svg?style=for-the-badge
[stars-url]: https://github.com/UnionInternationalCheminsdeFer/OSDM/stargazers

[issues-url]: https://github.com/UnionInternationalCheminsdeFer/OSDM/issues

[license-shield]: https://img.shields.io/github/license/UnionInternationalCheminsdeFer/OSDM.svg?style=for-the-badge
[license-url]: ./LICENSE.txt

[Typescript]: https://img.shields.io/badge/Typescript-35495E?style=for-the-badge&logo=TypeScript&logoColor=3178C6
[Typescript-url]: https://www.typescriptlang.org/

[Vue.js]: https://img.shields.io/badge/Vue.js-35495E?style=for-the-badge&logo=vue.js&logoColor=06B6D4
[Vue-url]: https://vuejs.org/

[Tailwind]: https://img.shields.io/badge/Tailwind-35495E?style=for-the-badge&logo=tailwind-css&logoColor=3178C6
[Tailwind-url]: https://tailwindcss.com/

[Vite]: https://img.shields.io/badge/Vite-35495E?style=for-the-badge&logo=Vite&logoColor=646CFF
[Vite-url]: https://vitejs.dev/

[Sbb-components-url]: https://lyne-storybook.app.sbb.ch/?path=/docs/introduction-getting-started--docs

[sandbox-list-url]: https://osdm.io/tools/sandboxes/
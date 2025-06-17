// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import { getAnalytics } from "firebase/analytics";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
  apiKey: "AIzaSyCb8b-7GvXnQRqEbjQYBBystkPyYEhA8aQ",
  authDomain: "famgo-app.firebaseapp.com",
  projectId: "famgo-app",
  storageBucket: "famgo-app.firebasestorage.app",
  messagingSenderId: "228634735885",
  appId: "1:228634735885:web:e3040ef7528bf9761b6c44",
  measurementId: "G-MHDGYWJ0WM"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);
const analytics = getAnalytics(app);
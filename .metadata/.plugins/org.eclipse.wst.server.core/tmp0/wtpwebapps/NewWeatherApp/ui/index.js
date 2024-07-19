/* 
To Customize Theme Color
*/

const colorSwitcher = document.querySelector("[data-theme-color-switch]");
let currentTheme = "light";

colorSwitcher.addEventListener("click", function () {
	const root = document.documentElement;

	if (currentTheme == "dark") {
		root.style.setProperty("--bg-color", "#fff");
		root.style.setProperty("--text-color", "#000");
		colorSwitcher.textContent = "\u{1F319}";
		currentTheme = "light";
	} else {
		root.style.setProperty("--bg-color", "#050505");
		root.style.setProperty("--text-color", "#fff");
		colorSwitcher.textContent = "\u{2600}";
		currentTheme = "dark";
	}

	colorSwitcher.setAttribute("data-theme", currentTheme);
});
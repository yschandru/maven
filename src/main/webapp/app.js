const form = document.getElementById('greeting-form');
const nameInput = document.getElementById('name');
const result = document.getElementById('result');

form.addEventListener('submit', async (event) => {
    event.preventDefault();

    const name = nameInput.value.trim();
    const response = await fetch(`/api/hello?name=${encodeURIComponent(name)}`);
    const data = await response.json();

    result.textContent = data.message;
});

# 🤖 Spring AI Chatbot with Ollama

This repository contains a **fully functional AI chatbot** built using **Spring AI** and the **Ollama Phi model**.  
It provides a **browser-based chat interface** with chat history, suggestion chips, and reactive AI responses.  
You can also use other Ollama-supported models instead of Phi if you prefer.

---

## 🚀 Features
- Fully offline AI chatbot powered by **Ollama Phi**  
- Modern browser interface with **user & AI chat bubbles**  
- Sidebar with **conversation history**  
- **Suggestion chips** for quick prompts  
- Dynamic input bar with **auto-resizing textarea**  
- Enter-to-send functionality  
- Easily extensible for **other Ollama models or cloud APIs**  
- Supports multiple AI models and can be switched easily  
- Optional integration with cloud AI services like OpenAI  

---

## 📦 How to Run Chatbot

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/yourusername/spring-ai-chatbot.git
cd spring-ai-chatbot
```

### 2️⃣ Install Java & Build Tools
- Java 17 or above  
- Maven or Gradle  

### 3️⃣ Install Ollama
Download and install Ollama from [https://ollama.com/download](https://ollama.com/download).  
Follow platform-specific instructions (Windows/macOS/Linux).

### 4️⃣ Download & Run Model
Default model: **Phi**
```bash
ollama pull phi
ollama run phi
```

Optional Ollama models you can use instead of Phi:  
- **LLaMA-2-7B** – lightweight, fast  
- **LLaMA-2-13B** – larger and more accurate  
- **GPT-4-like** – advanced reasoning  
- **Other Ollama-supported models**  

Switch models by running:
```bash
ollama pull <model-name>
ollama run <model-name>
```

---

### 5️⃣ Configure Spring Boot
Add required variables in `src/main/resources/application.properties`:

```properties
# Spring AI / Ollama
spring.ai.model=phi
spring.ai.host=localhost
spring.ai.port=11434

# Optional: OpenAI API key if you want cloud models
openai.api.key=<YOUR_KEY>
```

- `spring.ai.model` – Ollama model to use (phi by default)  
- `spring.ai.host` – Host for Ollama (localhost)  
- `spring.ai.port` – Port for Ollama (default 11434)  
- `openai.api.key` – Optional for cloud OpenAI models  

> You can also set these as **environment variables** instead of editing `application.properties`.

---

### 6️⃣ Run Spring Boot Backend
```bash
./mvnw spring-boot:run   # Maven
# or
./gradlew bootRun        # Gradle
```

---

### 7️⃣ Open Browser
Go to: `http://localhost:8080`  
Type a question or click suggestion chips — AI responses appear instantly.

> For temporary online access, you can use **ngrok**:
```bash
ngrok http 8080
```
Ngrok provides a public URL for testing or demos.  

---

## 🔐 Environment Variables / Application Properties
- `spring.ai.model` – Name of the Ollama model (phi by default)  
- `spring.ai.host` – Host for Ollama (localhost)  
- `spring.ai.port` – Port for Ollama (default 11434)  
- `openai.api.key` – Optional if using cloud OpenAI models  
- Other API keys if integrating additional services (Google Sheets, Gmail, etc.)

---

## 🛠 Tech Stack
- **Spring Boot + Spring AI**  
- **Ollama Phi or other Ollama models**  
- **HTML / CSS / JavaScript frontend**  
- Optional: **OpenAI API or other cloud AI services**

---

## 📌 Use Cases
- Offline AI assistant for **learning and experimentation**  
- Text summarization, question-answering, guidance  
- Browser-based AI demos  
- Experimenting with **different Ollama models**  
- Testing **Spring AI features** and reactive programming  
- AI-powered chatbots for private/local environments  

---

## ⚙️ Setup Requirements
- Java 17+  
- Maven or Gradle  
- Ollama installed locally  
- Ollama model downloaded (Phi by default; others optional)  
- Optional cloud AI keys for OpenAI or other services  

---

💡 **Notes**
- Fully offline once Ollama is installed  
- Responses may contain mistakes — always verify important info  
- UI is customizable (chat bubbles, scrolling, colors)  
- Temporary public access possible using **ngrok**  
- Easily switch models for experimentation  

---

Once everything is set up, open your browser at `http://localhost:8080` and start chatting with your AI!

---


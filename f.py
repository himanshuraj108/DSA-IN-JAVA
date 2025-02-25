import random

# Predefined responses
responses = {
    "hello": ["Hi there!", "Hello!", "Hey! How can I help you?"],
    "how are you": ["I'm just a bunch of code, but I'm doing great!", "I'm fine, thank you!", "Doing well! How about you?"],
    "what is your name": ["I'm your friendly chatbot!", "I don't have a name yet. What would you like to call me?"],
    "bye": ["Goodbye! Have a great day!", "See you later!", "Take care!"],
    "default": ["I'm sorry, I didn't understand that.", "Could you please rephrase?", "I'm here to help!"]
}

# Function to get a response
def get_response(user_input):
    user_input = user_input.lower()
    for key in responses:
        if key in user_input:
            return random.choice(responses[key])
    return random.choice(responses["default"])

# Main chatbot loop
def chatbot():
    print("Chatbot: Hi! I'm your chatbot. Type 'bye' to exit.")
    while True:
        user_input = input("You: ")
        if user_input.lower() == "bye":
            print("Chatbot:", random.choice(responses["bye"]))
            break
        response = get_response(user_input)
        print("Chatbot:", response)

# Run the chatbot
if __name__ == "__main__":
    chatbot()

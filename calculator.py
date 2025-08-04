
num1 = float(input("Enter the first number: "))
num2 = float(input("Enter the second number: "))

operation = input("Enter an operation (+, -, *, /): ")

if operation == '+':
    result = num1 + num2
    print(f"The result is: {result}")
elif operation == '-':
    result = num1 - num2
    print(f"The result is: {result}")
elif operation == '*':
    result = num1 * num2
    print(f"The result is: {result}")
elif operation == '/':
    if num2 != 0:
        result = num1 / num2
        print(f"The result is: {result}")
    else:
        print("Error: Cannot divide by zero.")
else:
    print("Invalid operation. Please enter one of +, -, *, /.")

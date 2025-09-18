# Создание массива типа список
a_list = ['a', 'b', 'c']
print("Список:", a_list)

# Организация стека
stack = []

# Добавление в стек
stack.append(1)    # [1]
stack.append(2)    # [1, 2]
stack.append(3)    # [1, 2, 3]
print("Стек после добавления:", stack)

# Удаление из стека
top = stack.pop()  # возвращает 3, stack = [1, 2]
print("Верхний элемент:", top)
print("Стек после удаления:", stack)
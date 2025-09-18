# Создание списка (массива)
my_list = [1, 2, 3, 4, 5]
print("Исходный список:", my_list)

# Добавление элементов
my_list.append(6)          # Добавить в конец
my_list.insert(0, 0)       # Вставить на позицию 0
print("После добавления:", my_list)

# Удаление элементов
removed = my_list.pop()    # Удалить последний элемент
print("Удаленный элемент:", removed)
print("После удаления:", my_list)

# Доступ к элементам
print("Первый элемент:", my_list[0])
print("Последний элемент:", my_list[-1])
print("Срез [1:4]:", my_list[1:4])

# Поиск элементов
if 3 in my_list:
    print("Элемент 3 найден на позиции:", my_list.index(3))

# Итерация по списку
print("Элементы списка:")
for item in my_list:
    print(item, end=" ")
print()

# Длина списка
print("Длина списка:", len(my_list))
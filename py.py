2. Упорядочивание методом последовательного сравнения
def ordering_by_comparison(data_list):
    size = len(data_list)

    for pass_num in range(size):
        for position in range(0, size - pass_num - 1):
            if data_list[position] > data_list[position + 1]:
                # Обмен соседних элементов
                data_list[position], data_list[position + 1] = data_list[position + 1], data_list[position]

# Демонстрация работы
numbers = [64, 34, 25, 12, 22, 11, 90]
print("Начальный набор чисел:", numbers)
ordering_by_comparison(numbers)
print("Упорядоченный набор:", numbers)
5. Упорядочивание с уменьшающимся шагом
def step_reduction_sort(collection):
    elements_count = len(collection)
    step_size = elements_count // 2

    while step_size > 0:
        for current_index in range(step_size, elements_count):
            current_value = collection[current_index]
            position = current_index

            while position >= step_size and collection[position - step_size] > current_value:
                collection[position] = collection[position - step_size]
                position -= step_size

            collection[position] = current_value
        step_size //= 2

# Демонстрация работы
data = [12, 34, 54, 2, 3]
print("Исходные данные:", data)
step_reduction_sort(data)
print("Обработанные данные:", data)
6. Эффективное упорядочивание разделением
def efficient_partition_sort(items):
    if len(items) <= 1:
        return items

    reference_element = items[len(items) // 2]
    smaller_items = [item for item in items if item < reference_element]
    equal_items = [item for item in items if item == reference_element]
    larger_items = [item for item in items if item > reference_element]

    return efficient_partition_sort(smaller_items) + equal_items + efficient_partition_sort(larger_items)

# Демонстрация работы
values = [10, 7, 8, 9, 1, 5]
print("Первоначальные значения:", values)
processed_values = efficient_partition_sort(values)
print("Упорядоченные значения:", processed_values)
8. Поиск перебором элементов
def element_by_element_search(sequence, desired_value):
    for index, element in enumerate(sequence):
        if element == desired_value:
            return index
    return None

# Демонстрация работы
elements_sequence = [3, 5, 2, 7, 9, 1, 4]
search_value = 7
found_position = element_by_element_search(elements_sequence, search_value)

if found_position is not None:
    print(f"Искомое значение обнаружено на позиции: {found_position}")
else:
    print("Значение в последовательности отсутствует")
    11. Поиск с использованием чисел Фибоначчи
    def fibonacci_based_search(ordered_list, target_element):
    list_length = len(ordered_list)
    fib_prev = 0
    fib_current = 1
    fib_next = fib_prev + fib_current

    while fib_next < list_length:
        fib_prev = fib_current
        fib_current = fib_next
        fib_next = fib_prev + fib_current

    start_offset = -1

    while fib_next > 1:
        check_index = min(start_offset + fib_prev, list_length - 1)

        if ordered_list[check_index] < target_element:
            fib_next = fib_current
            fib_current = fib_prev
            fib_prev = fib_next - fib_current
            start_offset = check_index

        elif ordered_list[check_index] > target_element:
            fib_next = fib_prev
            fib_current = fib_current - fib_prev
            fib_prev = fib_next - fib_current

        else:
            return check_index

    if fib_current and start_offset + 1 < list_length and ordered_list[start_offset + 1] == target_element:
        return start_offset + 1

    return -1

# Демонстрация работы
sorted_data = [10, 22, 35, 40, 45, 50, 80, 82, 85, 90, 100]
desired_number = 85
search_result = fibonacci_based_search(sorted_data, desired_number)

if search_result != -1:
    print(f"Элемент обнаружен на позиции: {search_result}")
else:
    print("Элемент в массиве не найден")

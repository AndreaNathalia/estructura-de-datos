def insertion_sort(array):
    for i in range (1, len(array)):
        k = array[i]

        move = i - 1
        while move >= 0 and k < array[move]:
            array[move + 1] = array[move]
            move -= 1
        
        array[move + 1] = k
        
    return array


# #Unsorted
# array = [5, 4, 3, 2, 1]
# print("\nUnsorted list: ")
# print(array)

# #Sorted
# insertion_sort(array)
# print("\nSorted list (using INSERTION SORT): ")
# print(array)
# print("")
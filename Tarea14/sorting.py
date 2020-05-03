
a = [13,5,7,9,1,3,4,6]
def selection_sort(unsorted):

    for i in range(0, len(unsorted) - 1):
        min = i

        for j in range(i + 1, len(unsorted)):
            if unsorted[j] < unsorted[min]:
                min = j

        if min != i:
            unsorted[i], unsorted[min] = unsorted[min], unsorted[i]

    return unsorted

# print(selection_sort(a))

def bubble_sort(unsorted):

    for i in range(0, len(unsorted)):
        for j in range(0, len(unsorted) - 1 - i):
            if unsorted[j] > unsorted[j + 1]:
                unsorted[j], unsorted[j + 1] = unsorted[j + 1], unsorted[j]

    return unsorted

# print(bubble_sort(a))

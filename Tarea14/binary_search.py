from insertion_sort import insertion_sort

def find(items, v):
    left = 0
    right = len(items) - 1

    while left <= right:
        sum = (left + right)
        mid = sum // 2

        if items[mid] == v:
            return mid
        
        if items[mid] < v:
            left = mid + 1

        elif items[mid] > v:
            right = mid - 1


#unsorted list
search = [3, 2, 7, 10, 5]
print("\nUnsorted list: ")
print(search)

insertion_sort(search)
print("\nSorted list (using INSERTION SORT): ")
print(search)

#val = int(input("\nWhat value do you want to find?: "))
val = 3

print("\nIndex of searched value: ")
print(find(search, val))
print("")


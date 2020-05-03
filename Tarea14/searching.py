#from typing import Tuple

l=[1,2,6,8,19,21,23]

def linear_search(sorted_list, value):

    for i in range(0, len(sorted_list)):
        if sorted_list[i] == value:
            return True, i

    return False, -1


def jump_search(sorted_list, value, step_size):

    for i in range(0, len(sorted_list), step_size):
        if sorted_list[i] > value:
            for j in range(i - step_size, i):
                if sorted_list[j] == value:
                    return True, j
            return False, -1

    for k in range(len(sorted_list) - step_size, len(sorted_list)):
        if sorted_list[k] == value:
            return True, k

    return False, -1

print(linear_search(l,23))
print(jump_search(l,23,4))

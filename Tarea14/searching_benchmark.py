from random import randint
from searching import linear_search, jump_search
from binary_search import find

sorted_list = list(range(1, 1000))
search_value = randint(1, 999)

def test_linear_search(benchmark):
    benchmark(linear_search, sorted_list, search_value)

def test_jump_search(benchmark):
    benchmark(jump_search, sorted_list, search_value, 10)

def test_binary_search(benchmark):
    benchmark(find, sorted_list, search_value)

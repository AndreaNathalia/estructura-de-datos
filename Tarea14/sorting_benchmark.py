from random import sample
from sorting import selection_sort, bubble_sort
from insertion_sort import insertion_sort

unsorted_list = sample(range(1, 1000), 999)
sorted_list = list(range(1, 1000))

def test_selection_sort(benchmark):
    result = benchmark(selection_sort, unsorted_list)
    assert result == sorted_list

def test_bubble_sort(benchmark):
    result = benchmark(bubble_sort, unsorted_list)
    assert result == sorted_list

def test_insertion_sort(benchmark):
    result = benchmark(insertion_sort, unsorted_list)
    assert result == sorted_list

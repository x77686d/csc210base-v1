class Counter:
    pass

def make_counter(name):
    """
    >>> c1 = make_counter("c1")
    >>> c1.name
    'c1'
    
    >>> c1.count
    0
    
    >>> click_counter(c1)
    >>> click_counter(c1)
    >>> c1.count
    2
    >>> str_for_counter(c1)
    "c1's count is 2"
    
    >>> reset_counter(c1)
    >>> c1.count
    0
    """
    
    c = Counter()
    c.name = name
    c.count = 0
    return c

def str_for_counter(c):
    return c.name + "'s count is " + str(c.count)

def click_counter(c):
    c.count += 1

def reset_counter(c):
    c.count = 0

if __name__ == "__main__":
    import doctest
    doctest.testmod()

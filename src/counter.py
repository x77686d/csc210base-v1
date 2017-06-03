class Counter:
    def __init__(self, name):
        self.__name = name
        self.__count = 0

    def click(self):
        self.__count += 1

    def count(self):
        return self.__count

    def __str__(self):
        return self.__name + \
            "'s count is " + \
            str(self.__count)

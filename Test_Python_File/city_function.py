def print_city(country, city, population=0):
    if population:
        string = '%s, %s - population = %s.' % (country, city, str(population))
    else:
        string = '%s, %s' % (country, city)
    return string.title()

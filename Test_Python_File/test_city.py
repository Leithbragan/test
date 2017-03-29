import unittest
from city_function import *


class CityTestCase(unittest.TestCase):
    def test_city_country(self):
        formatted_city = print_city('russia', 'kazan')
        self.assertEqual(formatted_city, 'Russia, Kazan')

    def test_population(self):
        formatted_city = print_city('santiago', 'chile', 5000000)
        self.assertEqual(formatted_city, 'Santiago, Chile - Population = 5000000.')
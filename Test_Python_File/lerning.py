def date_is_correct(date):
    if type(parsing_string_with_(date)) is list:

        print(parsing_string_with_(date))


def parsing_string_with_(date):
    if '_' in date:
        list_date = date.split('_')
    elif '-' in date:
        list_date = date.split('-')
    elif ' ' in date:
        list_date = date.split(' ')
    elif '.' in date:
        list_date = date.split('.')
    else:
        list_date = "даанные введены не верно"
    return list_date

date_is_correct('32.34.34')
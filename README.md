# Project Country Search

A student that completes this project shows that they can:

* Use IntelliJ in the following areas: application creation, code entry, and code execution
* Explain the uses of and differences between Maven, Spring, and Tomcat
* Build a REST service using Spring Boot
* Use and implement inversion of control and dependency injection with Spring
* Implement Beans throughout the Beans’ lifecycle controlling the Beans using annotations

## Introduction

The countries of the world have many different defining attributes including land size, population, and median age. Below is a list of countries to include in your data. As most people do their research using websites, we are going to create web services to help search this data. We will be returning JSON objects. Nothing fancy for now!

We will be creating an table for country data. The country model should contain the following fields. The model should be named `Country` and the table `countries`

* String name
* long population
* long landmasskm2
* int medianage

The model should also include the standard getters and setters. You should use the provided data.sql file to seed your data

Some Important Notes That Might help:

* The sort method must work with `int` - so not `long`. the solution - type casting! See the code snippet below:  
      `.sort((c1, c2) -> (int)(c1.getPopulation() - c2.getPopulation()))`
* To calculate median for stretch goals - if the list contains an odd number of items, pick the middle one. If the list contains an even number of items, pick either of the two items that lie in the middle.

Using the data.sql at the end, the endpoints will produce the following outputs. Expand to see the suggested outputs! Note that id numbers may vary.

### MVP

<details>
<summary>http://localhost:2019/names/all</summary>

```JSON
[
    {
        "countryid": 39,
        "name": "Afghanistan",
        "population": 37209007,
        "landmasskm2": 652860,
        "medianage": 19
    },
    {
        "countryid": 138,
        "name": "Albania",
        "population": 2938428,
        "landmasskm2": 27400,
        "medianage": 38
    },
    {
        "countryid": 34,
        "name": "Algeria",
        "population": 42679018,
        "landmasskm2": 2381740,
        "medianage": 29
    },
    {
        "countryid": 46,
        "name": "Angola",
        "population": 31787566,
        "landmasskm2": 1246700,
        "medianage": 17
    },
    {
        "countryid": 200,
        "name": "Antigua and Barbuda",
        "population": 104084,
        "landmasskm2": 440,
        "medianage": 32
    },
    {
        "countryid": 32,
        "name": "Argentina",
        "population": 45101781,
        "landmasskm2": 2736690,
        "medianage": 32
    },
    {
        "countryid": 139,
        "name": "Armenia",
        "population": 2936706,
        "landmasskm2": 28470,
        "medianage": 36
    },
    {
        "countryid": 198,
        "name": "Aruba",
        "population": 106053,
        "landmasskm2": 180,
        "medianage": 41
    },
    {
        "countryid": 55,
        "name": "Australia",
        "population": 25088636,
        "landmasskm2": 7682300,
        "medianage": 38
    },
    {
        "countryid": 97,
        "name": "Austria",
        "population": 8766201,
        "landmasskm2": 82409,
        "medianage": 44
    },
    {
        "countryid": 91,
        "name": "Azerbaijan",
        "population": 10014575,
        "landmasskm2": 82658,
        "medianage": 32
    },
    {
        "countryid": 177,
        "name": "Bahamas",
        "population": 403095,
        "landmasskm2": 10010,
        "medianage": 34
    },
    {
        "countryid": 152,
        "name": "Bahrain",
        "population": 1637896,
        "landmasskm2": 760,
        "medianage": 32
    },
    {
        "countryid": 8,
        "name": "Bangladesh",
        "population": 168065920,
        "landmasskm2": 130170,
        "medianage": 27
    },
    {
        "countryid": 184,
        "name": "Barbados",
        "population": 287010,
        "landmasskm2": 430,
        "medianage": 40
    },
    {
        "countryid": 95,
        "name": "Belarus",
        "population": 9433874,
        "landmasskm2": 202910,
        "medianage": 40
    },
    {
        "countryid": 81,
        "name": "Belgium",
        "population": 11562784,
        "landmasskm2": 30280,
        "medianage": 42
    },
    {
        "countryid": 178,
        "name": "Belize",
        "population": 390231,
        "landmasskm2": 22810,
        "medianage": 25
    },
    {
        "countryid": 78,
        "name": "Benin",
        "population": 11801595,
        "landmasskm2": 112760,
        "medianage": 19
    },
    {
        "countryid": 164,
        "name": "Bhutan",
        "population": 826229,
        "landmasskm2": 38117,
        "medianage": 29
    },
    {
        "countryid": 83,
        "name": "Bolivia",
        "population": 11379861,
        "landmasskm2": 1083300,
        "medianage": 25
    },
    {
        "countryid": 135,
        "name": "Bosnia & Herzegovina",
        "population": 3501774,
        "landmasskm2": 51000,
        "medianage": 42
    },
    {
        "countryid": 144,
        "name": "Botswana",
        "population": 2374636,
        "landmasskm2": 566730,
        "medianage": 26
    },
    {
        "countryid": 5,
        "name": "Brazil",
        "population": 212392717,
        "landmasskm2": 8358140,
        "medianage": 33
    },
    {
        "countryid": 175,
        "name": "Brunei",
        "population": 439336,
        "landmasskm2": 5270,
        "medianage": 32
    },
    {
        "countryid": 106,
        "name": "Bulgaria",
        "population": 6988739,
        "landmasskm2": 108560,
        "medianage": 45
    },
    {
        "countryid": 59,
        "name": "Burkina Faso",
        "population": 20321560,
        "landmasskm2": 273600,
        "medianage": 18
    },
    {
        "countryid": 80,
        "name": "Burundi",
        "population": 11575964,
        "landmasskm2": 25680,
        "medianage": 18
    },
    {
        "countryid": 172,
        "name": "Cabo Verde",
        "population": 560349,
        "landmasskm2": 4030,
        "medianage": 26
    },
    {
        "countryid": 72,
        "name": "Cambodia",
        "population": 16482646,
        "landmasskm2": 176520,
        "medianage": 26
    },
    {
        "countryid": 54,
        "name": "Cameroon",
        "population": 25312993,
        "landmasskm2": 472710,
        "medianage": 19
    },
    {
        "countryid": 38,
        "name": "Canada",
        "population": 37279811,
        "landmasskm2": 9093510,
        "medianage": 41
    },
    {
        "countryid": 126,
        "name": "Central African Republic",
        "population": 4825711,
        "landmasskm2": 622980,
        "medianage": 18
    },
    {
        "countryid": 73,
        "name": "Chad",
        "population": 15814345,
        "landmasskm2": 1259200,
        "medianage": 17
    },
    {
        "countryid": 191,
        "name": "Channel Islands",
        "population": 166828,
        "landmasskm2": 190,
        "medianage": 44
    },
    {
        "countryid": 65,
        "name": "Chile",
        "population": 18336653,
        "landmasskm2": 743532,
        "medianage": 35
    },
    {
        "countryid": 1,
        "name": "China",
        "population": 1420062022,
        "landmasskm2": 9388211,
        "medianage": 39
    },
    {
        "countryid": 29,
        "name": "Colombia",
        "population": 49849818,
        "landmasskm2": 1109500,
        "medianage": 32
    },
    {
        "countryid": 163,
        "name": "Comoros",
        "population": 850910,
        "landmasskm2": 1861,
        "medianage": 20
    },
    {
        "countryid": 117,
        "name": "Congo",
        "population": 5542197,
        "landmasskm2": 341500,
        "medianage": 19
    },
    {
        "countryid": 123,
        "name": "Costa Rica",
        "population": 4999384,
        "landmasskm2": 51060,
        "medianage": 34
    },
    {
        "countryid": 53,
        "name": "Cote dIvoire",
        "population": 25531083,
        "landmasskm2": 318000,
        "medianage": 19
    },
    {
        "countryid": 131,
        "name": "Croatia",
        "population": 4140148,
        "landmasskm2": 55960,
        "medianage": 44
    },
    {
        "countryid": 82,
        "name": "Cuba",
        "population": 11492046,
        "landmasskm2": 106440,
        "medianage": 43
    },
    {
        "countryid": 192,
        "name": "Curacao",
        "population": 162547,
        "landmasskm2": 444,
        "medianage": 42
    },
    {
        "countryid": 159,
        "name": "Cyprus",
        "population": 1198427,
        "landmasskm2": 9240,
        "medianage": 37
    },
    {
        "countryid": 87,
        "name": "Czech Republic",
        "population": 10630589,
        "landmasskm2": 77240,
        "medianage": 43
    },
    {
        "countryid": 115,
        "name": "Denmark",
        "population": 5775224,
        "landmasskm2": 42430,
        "medianage": 42
    },
    {
        "countryid": 160,
        "name": "Djibouti",
        "population": 985690,
        "landmasskm2": 23180,
        "medianage": 25
    },
    {
        "countryid": 86,
        "name": "Dominican Republic",
        "population": 10996774,
        "landmasskm2": 48320,
        "medianage": 28
    },
    {
        "countryid": 16,
        "name": "DR Congo",
        "population": 86727573,
        "landmasskm2": 2267050,
        "medianage": 17
    },
    {
        "countryid": 70,
        "name": "Ecuador",
        "population": 17100444,
        "landmasskm2": 248360,
        "medianage": 28
    },
    {
        "countryid": 14,
        "name": "Egypt",
        "population": 101168745,
        "landmasskm2": 995450,
        "medianage": 25
    },
    {
        "countryid": 109,
        "name": "El Salvador",
        "population": 6445405,
        "landmasskm2": 20720,
        "medianage": 28
    },
    {
        "countryid": 155,
        "name": "Equatorial Guinea",
        "population": 1360104,
        "landmasskm2": 28050,
        "medianage": 22
    },
    {
        "countryid": 120,
        "name": "Eritrea",
        "population": 5309659,
        "landmasskm2": 101000,
        "medianage": 19
    },
    {
        "countryid": 157,
        "name": "Estonia",
        "population": 1303798,
        "landmasskm2": 42390,
        "medianage": 43
    },
    {
        "countryid": 12,
        "name": "Ethiopia",
        "population": 110135635,
        "landmasskm2": 1000000,
        "medianage": 20
    },
    {
        "countryid": 161,
        "name": "Fiji",
        "population": 918757,
        "landmasskm2": 18270,
        "medianage": 29
    },
    {
        "countryid": 116,
        "name": "Finland",
        "population": 5561389,
        "landmasskm2": 303890,
        "medianage": 43
    },
    {
        "countryid": 22,
        "name": "France",
        "population": 65480710,
        "landmasskm2": 547557,
        "medianage": 42
    },
    {
        "countryid": 181,
        "name": "French Guiana",
        "population": 296847,
        "landmasskm2": 82200,
        "medianage": 25
    },
    {
        "countryid": 182,
        "name": "French Polynesia",
        "population": 288506,
        "landmasskm2": 3660,
        "medianage": 33
    },
    {
        "countryid": 147,
        "name": "Gabon",
        "population": 2109099,
        "landmasskm2": 257670,
        "medianage": 23
    },
    {
        "countryid": 146,
        "name": "Gambia",
        "population": 2228075,
        "landmasskm2": 10120,
        "medianage": 18
    },
    {
        "countryid": 133,
        "name": "Georgia",
        "population": 3904204,
        "landmasskm2": 69490,
        "medianage": 39
    },
    {
        "countryid": 19,
        "name": "Germany",
        "population": 82438639,
        "landmasskm2": 348560,
        "medianage": 47
    },
    {
        "countryid": 48,
        "name": "Ghana",
        "population": 30096970,
        "landmasskm2": 227540,
        "medianage": 21
    },
    {
        "countryid": 85,
        "name": "Greece",
        "population": 11124603,
        "landmasskm2": 128900,
        "medianage": 45
    },
    {
        "countryid": 196,
        "name": "Grenada",
        "population": 108825,
        "landmasskm2": 340,
        "medianage": 29
    },
    {
        "countryid": 174,
        "name": "Guadeloupe",
        "population": 448798,
        "landmasskm2": 1690,
        "medianage": 43
    },
    {
        "countryid": 190,
        "name": "Guam",
        "population": 167245,
        "landmasskm2": 540,
        "medianage": 31
    },
    {
        "countryid": 67,
        "name": "Guatemala",
        "population": 17577842,
        "landmasskm2": 107160,
        "medianage": 23
    },
    {
        "countryid": 75,
        "name": "Guinea",
        "population": 13398180,
        "landmasskm2": 245720,
        "medianage": 19
    },
    {
        "countryid": 150,
        "name": "Guinea-Bissau",
        "population": 1953723,
        "landmasskm2": 28120,
        "medianage": 19
    },
    {
        "countryid": 165,
        "name": "Guyana",
        "population": 786508,
        "landmasskm2": 196850,
        "medianage": 26
    },
    {
        "countryid": 84,
        "name": "Haiti",
        "population": 11242856,
        "landmasskm2": 27560,
        "medianage": 24
    },
    {
        "countryid": 94,
        "name": "Honduras",
        "population": 9568688,
        "landmasskm2": 111890,
        "medianage": 25
    },
    {
        "countryid": 104,
        "name": "Hong Kong",
        "population": 7490776,
        "landmasskm2": 1050,
        "medianage": 45
    },
    {
        "countryid": 93,
        "name": "Hungary",
        "population": 9655361,
        "landmasskm2": 90530,
        "medianage": 43
    },
    {
        "countryid": 180,
        "name": "Iceland",
        "population": 340566,
        "landmasskm2": 100250,
        "medianage": 37
    },
    {
        "countryid": 2,
        "name": "India",
        "population": 1368737513,
        "landmasskm2": 2973190,
        "medianage": 28
    },
    {
        "countryid": 4,
        "name": "Indonesia",
        "population": 269536482,
        "landmasskm2": 1811570,
        "medianage": 29
    },
    {
        "countryid": 18,
        "name": "Iran",
        "population": 82820766,
        "landmasskm2": 1628550,
        "medianage": 32
    },
    {
        "countryid": 36,
        "name": "Iraq",
        "population": 40412299,
        "landmasskm2": 434320,
        "medianage": 20
    },
    {
        "countryid": 125,
        "name": "Ireland",
        "population": 4847139,
        "landmasskm2": 68890,
        "medianage": 39
    },
    {
        "countryid": 101,
        "name": "Israel",
        "population": 8583916,
        "landmasskm2": 21640,
        "medianage": 31
    },
    {
        "countryid": 24,
        "name": "Italy",
        "population": 59216525,
        "landmasskm2": 294140,
        "medianage": 48
    },
    {
        "countryid": 140,
        "name": "Jamaica",
        "population": 2906339,
        "landmasskm2": 10830,
        "medianage": 31
    },
    {
        "countryid": 11,
        "name": "Japan",
        "population": 126854745,
        "landmasskm2": 364555,
        "medianage": 48
    },
    {
        "countryid": 89,
        "name": "Jordan",
        "population": 10069794,
        "landmasskm2": 88780,
        "medianage": 23
    },
    {
        "countryid": 63,
        "name": "Kazakhstan",
        "population": 18592970,
        "landmasskm2": 2699700,
        "medianage": 31
    },
    {
        "countryid": 27,
        "name": "Kenya",
        "population": 52214791,
        "landmasskm2": 569140,
        "medianage": 20
    },
    {
        "countryid": 193,
        "name": "Kiribati",
        "population": 120428,
        "landmasskm2": 810,
        "medianage": 23
    },
    {
        "countryid": 129,
        "name": "Kuwait",
        "population": 4248974,
        "landmasskm2": 17820,
        "medianage": 34
    },
    {
        "countryid": 111,
        "name": "Kyrgyzstan",
        "population": 6218616,
        "landmasskm2": 191800,
        "medianage": 26
    },
    {
        "countryid": 105,
        "name": "Laos",
        "population": 7064242,
        "landmasskm2": 230800,
        "medianage": 24
    },
    {
        "countryid": 151,
        "name": "Latvia",
        "population": 1911108,
        "landmasskm2": 62200,
        "medianage": 44
    },
    {
        "countryid": 112,
        "name": "Lebanon",
        "population": 6065922,
        "landmasskm2": 10230,
        "medianage": 31
    },
    {
        "countryid": 145,
        "name": "Lesotho",
        "population": 2292682,
        "landmasskm2": 30360,
        "medianage": 22
    },
    {
        "countryid": 124,
        "name": "Liberia",
        "population": 4977720,
        "landmasskm2": 96320,
        "medianage": 19
    },
    {
        "countryid": 108,
        "name": "Libya",
        "population": 6569864,
        "landmasskm2": 1759540,
        "medianage": 29
    },
    {
        "countryid": 141,
        "name": "Lithuania",
        "population": 2864459,
        "landmasskm2": 62674,
        "medianage": 43
    },
    {
        "countryid": 169,
        "name": "Luxembourg",
        "population": 596992,
        "landmasskm2": 2590,
        "medianage": 40
    },
    {
        "countryid": 166,
        "name": "Macao",
        "population": 642090,
        "landmasskm2": 30,
        "medianage": 39
    },
    {
        "countryid": 51,
        "name": "Madagascar",
        "population": 26969642,
        "landmasskm2": 581795,
        "medianage": 20
    },
    {
        "countryid": 60,
        "name": "Malawi",
        "population": 19718743,
        "landmasskm2": 94280,
        "medianage": 18
    },
    {
        "countryid": 45,
        "name": "Malaysia",
        "population": 32454455,
        "landmasskm2": 328550,
        "medianage": 30
    },
    {
        "countryid": 173,
        "name": "Maldives",
        "population": 451738,
        "landmasskm2": 300,
        "medianage": 31
    },
    {
        "countryid": 61,
        "name": "Mali",
        "population": 19689140,
        "landmasskm2": 1220190,
        "medianage": 16
    },
    {
        "countryid": 176,
        "name": "Malta",
        "population": 433245,
        "landmasskm2": 320,
        "medianage": 42
    },
    {
        "countryid": 179,
        "name": "Martinique",
        "population": 385320,
        "landmasskm2": 1060,
        "medianage": 46
    },
    {
        "countryid": 128,
        "name": "Mauritania",
        "population": 4661149,
        "landmasskm2": 1030700,
        "medianage": 20
    },
    {
        "countryid": 158,
        "name": "Mauritius",
        "population": 1271368,
        "landmasskm2": 2030,
        "medianage": 37
    },
    {
        "countryid": 186,
        "name": "Mayotte",
        "population": 266380,
        "landmasskm2": 375,
        "medianage": 20
    },
    {
        "countryid": 10,
        "name": "Mexico",
        "population": 132328035,
        "landmasskm2": 1943950,
        "medianage": 29
    },
    {
        "countryid": 197,
        "name": "Micronesia",
        "population": 106983,
        "landmasskm2": 700,
        "medianage": 23
    },
    {
        "countryid": 132,
        "name": "Moldova",
        "population": 4029750,
        "landmasskm2": 32850,
        "medianage": 38
    },
    {
        "countryid": 137,
        "name": "Mongolia",
        "population": 3166244,
        "landmasskm2": 1553560,
        "medianage": 29
    },
    {
        "countryid": 168,
        "name": "Montenegro",
        "population": 629355,
        "landmasskm2": 13450,
        "medianage": 39
    },
    {
        "countryid": 40,
        "name": "Morocco",
        "population": 36635156,
        "landmasskm2": 446300,
        "medianage": 30
    },
    {
        "countryid": 47,
        "name": "Mozambique",
        "population": 31408823,
        "landmasskm2": 786380,
        "medianage": 18
    },
    {
        "countryid": 26,
        "name": "Myanmar",
        "population": 54336138,
        "landmasskm2": 653290,
        "medianage": 29
    },
    {
        "countryid": 143,
        "name": "Namibia",
        "population": 2641996,
        "landmasskm2": 823290,
        "medianage": 22
    },
    {
        "countryid": 49,
        "name": "Nepal",
        "population": 29942018,
        "landmasskm2": 143350,
        "medianage": 25
    },
    {
        "countryid": 69,
        "name": "Netherlands",
        "population": 17132908,
        "landmasskm2": 33720,
        "medianage": 43
    },
    {
        "countryid": 185,
        "name": "New Caledonia",
        "population": 283376,
        "landmasskm2": 18280,
        "medianage": 33
    },
    {
        "countryid": 127,
        "name": "New Zealand",
        "population": 4792409,
        "landmasskm2": 263310,
        "medianage": 38
    },
    {
        "countryid": 110,
        "name": "Nicaragua",
        "population": 6351157,
        "landmasskm2": 120340,
        "medianage": 27
    },
    {
        "countryid": 57,
        "name": "Niger",
        "population": 23176691,
        "landmasskm2": 1266700,
        "medianage": 15
    },
    {
        "countryid": 7,
        "name": "Nigeria",
        "population": 200962417,
        "landmasskm2": 910770,
        "medianage": 18
    },
    {
        "countryid": 52,
        "name": "North Korea",
        "population": 25727408,
        "landmasskm2": 120410,
        "medianage": 35
    },
    {
        "countryid": 119,
        "name": "Norway",
        "population": 5400916,
        "landmasskm2": 365268,
        "medianage": 40
    },
    {
        "countryid": 122,
        "name": "Oman",
        "population": 5001875,
        "landmasskm2": 309500,
        "medianage": 31
    },
    {
        "countryid": 6,
        "name": "Pakistan",
        "population": 204596442,
        "landmasskm2": 770880,
        "medianage": 23
    },
    {
        "countryid": 130,
        "name": "Panama",
        "population": 4226197,
        "landmasskm2": 74340,
        "medianage": 30
    },
    {
        "countryid": 100,
        "name": "Papua New Guinea",
        "population": 8586525,
        "landmasskm2": 452860,
        "medianage": 23
    },
    {
        "countryid": 107,
        "name": "Paraguay",
        "population": 6981981,
        "landmasskm2": 397300,
        "medianage": 27
    },
    {
        "countryid": 42,
        "name": "Peru",
        "population": 32933835,
        "landmasskm2": 1280000,
        "medianage": 29
    },
    {
        "countryid": 13,
        "name": "Philippines",
        "population": 108106310,
        "landmasskm2": 298170,
        "medianage": 25
    },
    {
        "countryid": 37,
        "name": "Poland",
        "population": 38028278,
        "landmasskm2": 306230,
        "medianage": 42
    },
    {
        "countryid": 88,
        "name": "Portugal",
        "population": 10254666,
        "landmasskm2": 91590,
        "medianage": 46
    },
    {
        "countryid": 134,
        "name": "Puerto Rico",
        "population": 3654978,
        "landmasskm2": 8870,
        "medianage": 38
    },
    {
        "countryid": 142,
        "name": "Qatar",
        "population": 2743901,
        "landmasskm2": 11610,
        "medianage": 32
    },
    {
        "countryid": 162,
        "name": "Reunion",
        "population": 889918,
        "landmasskm2": 2500,
        "medianage": 36
    },
    {
        "countryid": 62,
        "name": "Romania",
        "population": 19483360,
        "landmasskm2": 230170,
        "medianage": 43
    },
    {
        "countryid": 9,
        "name": "Russia",
        "population": 143895551,
        "landmasskm2": 16376870,
        "medianage": 40
    },
    {
        "countryid": 77,
        "name": "Rwanda",
        "population": 12794412,
        "landmasskm2": 24670,
        "medianage": 20
    },
    {
        "countryid": 189,
        "name": "Saint Lucia",
        "population": 180454,
        "landmasskm2": 610,
        "medianage": 35
    },
    {
        "countryid": 188,
        "name": "Samoa",
        "population": 198909,
        "landmasskm2": 2830,
        "medianage": 22
    },
    {
        "countryid": 187,
        "name": "Sao Tome & Principe",
        "population": 213379,
        "landmasskm2": 960,
        "medianage": 19
    },
    {
        "countryid": 41,
        "name": "Saudi Arabia",
        "population": 34140662,
        "landmasskm2": 2149690,
        "medianage": 32
    },
    {
        "countryid": 71,
        "name": "Senegal",
        "population": 16743859,
        "landmasskm2": 192530,
        "medianage": 19
    },
    {
        "countryid": 98,
        "name": "Serbia",
        "population": 8733407,
        "landmasskm2": 87460,
        "medianage": 41
    },
    {
        "countryid": 201,
        "name": "Seychelles",
        "population": 95702,
        "landmasskm2": 460,
        "medianage": 36
    },
    {
        "countryid": 103,
        "name": "Sierra Leone",
        "population": 7883123,
        "landmasskm2": 72180,
        "medianage": 19
    },
    {
        "countryid": 114,
        "name": "Singapore",
        "population": 5868104,
        "landmasskm2": 700,
        "medianage": 42
    },
    {
        "countryid": 118,
        "name": "Slovakia",
        "population": 5450987,
        "landmasskm2": 48088,
        "medianage": 41
    },
    {
        "countryid": 149,
        "name": "Slovenia",
        "population": 2081900,
        "landmasskm2": 20140,
        "medianage": 45
    },
    {
        "countryid": 167,
        "name": "Solomon Islands",
        "population": 635254,
        "landmasskm2": 27990,
        "medianage": 21
    },
    {
        "countryid": 74,
        "name": "Somalia",
        "population": 15636171,
        "landmasskm2": 627340,
        "medianage": 17
    },
    {
        "countryid": 25,
        "name": "South Africa",
        "population": 58065097,
        "landmasskm2": 1213090,
        "medianage": 27
    },
    {
        "countryid": 28,
        "name": "South Korea",
        "population": 51339238,
        "landmasskm2": 97230,
        "medianage": 43
    },
    {
        "countryid": 76,
        "name": "South Sudan",
        "population": 13263184,
        "landmasskm2": 610952,
        "medianage": 19
    },
    {
        "countryid": 30,
        "name": "Spain",
        "population": 46441049,
        "landmasskm2": 498800,
        "medianage": 46
    },
    {
        "countryid": 58,
        "name": "Sri Lanka",
        "population": 21018859,
        "landmasskm2": 62710,
        "medianage": 34
    },
    {
        "countryid": 194,
        "name": "St. Vincent & Grenadines",
        "population": 110488,
        "landmasskm2": 390,
        "medianage": 32
    },
    {
        "countryid": 121,
        "name": "State of Palestine",
        "population": 5186790,
        "landmasskm2": 6020,
        "medianage": 20
    },
    {
        "countryid": 35,
        "name": "Sudan",
        "population": 42514094,
        "landmasskm2": 1765048,
        "medianage": 20
    },
    {
        "countryid": 171,
        "name": "Suriname",
        "population": 573085,
        "landmasskm2": 156000,
        "medianage": 30
    },
    {
        "countryid": 153,
        "name": "Swaziland",
        "population": 1415414,
        "landmasskm2": 17200,
        "medianage": 21
    },
    {
        "countryid": 90,
        "name": "Sweden",
        "population": 10053135,
        "landmasskm2": 410340,
        "medianage": 41
    },
    {
        "countryid": 99,
        "name": "Switzerland",
        "population": 8608259,
        "landmasskm2": 39516,
        "medianage": 43
    },
    {
        "countryid": 64,
        "name": "Syria",
        "population": 18499181,
        "landmasskm2": 183630,
        "medianage": 22
    },
    {
        "countryid": 56,
        "name": "Taiwan",
        "population": 23758247,
        "landmasskm2": 35410,
        "medianage": 42
    },
    {
        "countryid": 96,
        "name": "Tajikistan",
        "population": 9292000,
        "landmasskm2": 139960,
        "medianage": 23
    },
    {
        "countryid": 23,
        "name": "Tanzania",
        "population": 60913557,
        "landmasskm2": 885800,
        "medianage": 18
    },
    {
        "countryid": 148,
        "name": "TFYR Macedonia",
        "population": 2086720,
        "landmasskm2": 25220,
        "medianage": 39
    },
    {
        "countryid": 20,
        "name": "Thailand",
        "population": 69306160,
        "landmasskm2": 510890,
        "medianage": 40
    },
    {
        "countryid": 156,
        "name": "Timor-Leste",
        "population": 1352360,
        "landmasskm2": 14870,
        "medianage": 18
    },
    {
        "countryid": 102,
        "name": "Togo",
        "population": 8186384,
        "landmasskm2": 54390,
        "medianage": 19
    },
    {
        "countryid": 195,
        "name": "Tonga",
        "population": 110041,
        "landmasskm2": 720,
        "medianage": 22
    },
    {
        "countryid": 154,
        "name": "Trinidad and Tobago",
        "population": 1375443,
        "landmasskm2": 5130,
        "medianage": 36
    },
    {
        "countryid": 79,
        "name": "Tunisia",
        "population": 11783168,
        "landmasskm2": 155360,
        "medianage": 33
    },
    {
        "countryid": 17,
        "name": "Turkey",
        "population": 82961805,
        "landmasskm2": 769630,
        "medianage": 32
    },
    {
        "countryid": 113,
        "name": "Turkmenistan",
        "population": 5942561,
        "landmasskm2": 469930,
        "medianage": 27
    },
    {
        "countryid": 21,
        "name": "U.K.",
        "population": 66959016,
        "landmasskm2": 241930,
        "medianage": 41
    },
    {
        "countryid": 3,
        "name": "U.S.",
        "population": 329093110,
        "landmasskm2": 9147420,
        "medianage": 38
    },
    {
        "countryid": 199,
        "name": "U.S. Virgin Islands",
        "population": 104909,
        "landmasskm2": 350,
        "medianage": 42
    },
    {
        "countryid": 31,
        "name": "Uganda",
        "population": 45711874,
        "landmasskm2": 199810,
        "medianage": 16
    },
    {
        "countryid": 33,
        "name": "Ukraine",
        "population": 43795220,
        "landmasskm2": 579320,
        "medianage": 41
    },
    {
        "countryid": 92,
        "name": "United Arab Emirates",
        "population": 9682088,
        "landmasskm2": 83600,
        "medianage": 34
    },
    {
        "countryid": 136,
        "name": "Uruguay",
        "population": 3482156,
        "landmasskm2": 175020,
        "medianage": 36
    },
    {
        "countryid": 43,
        "name": "Uzbekistan",
        "population": 32807368,
        "landmasskm2": 425400,
        "medianage": 28
    },
    {
        "countryid": 183,
        "name": "Vanuatu",
        "population": 288017,
        "landmasskm2": 12190,
        "medianage": 23
    },
    {
        "countryid": 44,
        "name": "Venezuela",
        "population": 32779868,
        "landmasskm2": 882050,
        "medianage": 29
    },
    {
        "countryid": 15,
        "name": "Viet Nam",
        "population": 97429061,
        "landmasskm2": 310070,
        "medianage": 33
    },
    {
        "countryid": 170,
        "name": "Western Sahara",
        "population": 582478,
        "landmasskm2": 266000,
        "medianage": 28
    },
    {
        "countryid": 50,
        "name": "Yemen",
        "population": 29579986,
        "landmasskm2": 527970,
        "medianage": 20
    },
    {
        "countryid": 66,
        "name": "Zambia",
        "population": 18137369,
        "landmasskm2": 743390,
        "medianage": 18
    },
    {
        "countryid": 68,
        "name": "Zimbabwe",
        "population": 17297495,
        "landmasskm2": 386850,
        "medianage": 20
    }
]
```

</details>

<details>
<summary>http://localhost:2019/names/start/u</summary>

```JSON
[
    {
        "countryid": 21,
        "name": "U.K.",
        "population": 66959016,
        "landmasskm2": 241930,
        "medianage": 41
    },
    {
        "countryid": 3,
        "name": "U.S.",
        "population": 329093110,
        "landmasskm2": 9147420,
        "medianage": 38
    },
    {
        "countryid": 199,
        "name": "U.S. Virgin Islands",
        "population": 104909,
        "landmasskm2": 350,
        "medianage": 42
    },
    {
        "countryid": 31,
        "name": "Uganda",
        "population": 45711874,
        "landmasskm2": 199810,
        "medianage": 16
    },
    {
        "countryid": 33,
        "name": "Ukraine",
        "population": 43795220,
        "landmasskm2": 579320,
        "medianage": 41
    },
    {
        "countryid": 92,
        "name": "United Arab Emirates",
        "population": 9682088,
        "landmasskm2": 83600,
        "medianage": 34
    },
    {
        "countryid": 136,
        "name": "Uruguay",
        "population": 3482156,
        "landmasskm2": 175020,
        "medianage": 36
    },
    {
        "countryid": 43,
        "name": "Uzbekistan",
        "population": 32807368,
        "landmasskm2": 425400,
        "medianage": 28
    }
]
```

</details>

<details>
<summary>http://localhost:2019/population/total</summary>

In the console

```TEXT
The Total Population is 7713495811
```

In the REST client

```JSON
Status OK
```

</details>

<details>
<summary>http://localhost:2019/population/min</summary>

```JSON
{
    "countryid": 201,
    "name": "Seychelles",
    "population": 95702,
    "landmasskm2": 460,
    "medianage": 36
}
```

</details>

<details>
<summary>http://localhost:2019/population/max</summary>

```JSON
{
    "countryid": 1,
    "name": "China",
    "population": 1420062022,
    "landmasskm2": 9388211,
    "medianage": 39
}
```

</details>

### Stretch Goal

<details>
<summary>http://localhost:2019/population/median</summary>

```JSON
{
    "countryid": 100,
    "name": "Papua New Guinea",
    "population": 8586525,
    "landmasskm2": 452860,
    "medianage": 23
}
```

## Instruction

The following URLs should return the requested data given the parameters

* [x] /names/all - return the names of all the countries alphabetically
* [x] /names/start/{letter} - return the countries alphabetically that begin with the given letter

* [x] /population/total - return the total population of all countries in the console while returning Http Status OK as the response.
* [x] /population/min - return the country with the smallest population
* [x] /population/max - return the country with the largest population

### Stretch Goal

* [x] /population/median - return the country with the median population

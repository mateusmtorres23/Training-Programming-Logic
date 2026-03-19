from datetime import datetime
from dateutil.relativedelta import relativedelta

loan = 1000000
initial_date = datetime(2022, 12, 20)
years_delta = relativedelta(years=5)
final_date = initial_date + years_delta

installments_dates = []
while initial_date < final_date:
    installments_dates.append(initial_date)
    initial_date += relativedelta(months=1)

for date in installments_dates:
    print(f"{date:%d/%m/%Y} - R$ {loan/len(installments_dates):,.2f}")

print(f"\n number of installments: {len(installments_dates)}")


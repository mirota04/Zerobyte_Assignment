# Zerobyte_Assignment

Zerobyte დირექტორიაში არის src დირექტორია, სადაც main ფოლდეერში არის ჩვენი კოდის ფაილები. თითოეული ფაილისთვის, თავისი დანიშნულებიამებრ, არის ცალკე დირექტორიები გაკეთებული:
controller
dto
model
service
და მათთან ერთად CheapestTransferRouteApplication.java ფაილი, სადაც არის მეინ ფუნქცია. ამოცანის ძირითადი ლოგიკა არის TransferService.java ფაილში.
სერვერის გაშვების შემდეგ ვიყენებთ დამხმარე აპლიკაცია postman-ს. ამ უკანასკნელში როდესაც POST რექვესთს ვაგზავნით შემდეგ URL-ზე:
http://localhost:8080/api/transfer/calculate-route
body-ში შეგვყავს ჩვენი მონცებემი JSON ფორმატით, მაგალითად:
{
  "maxWeight": 1000,
  "availableTransfers": [
    {
      "weight": 500,
      "cost": 200
    },
    {
      "weight": 300,
      "cost": 150
    },
    {
        "weight": 500,
        "cost": 400
    }
  ]
}

და სერვერის გაშვების შემდეგ გვიბრუნებს პასუხებს, მაგალითად:
{
    "selectedTransfers": [
        {
            "weight": 500,
            "cost": 400
        },
        {
            "weight": 500,
            "cost": 200
        }
    ],
    "totalCost": 600,
    "totalWeight": 1000
}

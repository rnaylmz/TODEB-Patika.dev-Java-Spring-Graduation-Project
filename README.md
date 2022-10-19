# TODEB Patika.dev Java Spring Bitirme Projesi - Credit Application System

## USING TECHNOLOGIES

* Java
* 

## REQUIRENMENTS

1.Register/Login

2.Customer

3.Credit apllication for customer

4.Giving credit score for each customer

5.Credit limit calculating for giving credit limit


## ANALYSIS

1.User login or register as customer or admin

2.Customer can apply for credit from credit application 

3.Credit score service produce score for each customer

4.When a customer apply for credit, credit application service get credit score from customer for calculating credit limit as four conditions.

- 500 score and down-rejected
- 500-1000 score and less than 5k salary-confirmed and give 10k limit
- 500-1000 score and greater than 5k salary-confirmed and give 20k limit
- 1000 score and upper- calculate special limit

5.Send message to phone number of customer if a apply is confirmed.


# USER CASE DIAGRAM


![creditApp](https://user-images.githubusercontent.com/82233346/184532300-0522f807-8fcd-4f1a-956d-372d18ba9a76.png)


# UML CLASS DIAGRAM


![entityManagerFactory(EntityManagerFactoryBuilder)](https://user-images.githubusercontent.com/82233346/184551807-f9f3dbde-532f-406c-8200-1b7bc6081d37.png)


# SWAGGER UI

![image](https://user-images.githubusercontent.com/82233346/184567496-7110d540-1ae8-4273-b458-32412de6b447.png)

# TODO

- Add sample datas
- Finish testing
- Kafka
- UI

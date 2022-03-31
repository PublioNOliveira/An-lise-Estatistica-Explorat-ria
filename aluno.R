setwd('C:\\Users\\poliveira\\Desktop')

df = read.csv("alunos.txt", header = T)

table(df$Genero)/sum(table(df$Genero))
history(df$Genero)

table(df$Curso)/sum(table(df$Curso))
table(df$Profissao)/sum(table(df$Profissao))

#mean(df$Idade)
#median(df$Idade)
summary(df$Idade)
var(df$Idade)
sd(df$Idade)

summary(df$Periodo)
var(df$Periodo)
sd(df$Periodo)

summary(df$AnoEntrada)
var(df$AnoEntrada)
sd(df$AnoEntrada)

summary(df$SemestreEntrada)
var(df$SemestreEntrada)
sd(df$SemestreEntrada)

summary(df$MaiorNota)
var(df$MaiorNota)
sd(df$MaiorNota)

summary(df$MenorNota)
var(df$MenorNota)
sd(df$MenorNota)

summary(df$Salario)
var(df$Salario)
sd(df$Salario)
hist(df$Salario)
barplot(df$Salario)
boxplot(df$Salario)

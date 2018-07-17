#include <HCSR04.h>

HCSR04 sensor(11,12); // (PIN Trigger, PIN Echo)
HCSR04 sensor1(8,9); // (PIN Trigger, PIN Echo)

int led = 2;
int led2 = 3;
int presion = A1;
int fuerza;
void setup()
{
  pinMode(led, OUTPUT);
  pinMode(led2, OUTPUT);
  Serial.begin(9600);
}


void loop()
{
 float distancia1;
 float distancia2;
 distancia1 = sensor.dist();
 distancia2 = sensor1.dist();
 /*
 Serial.print ("la distancia del primer sensor es: ");
 Serial.print(distancia1);
 Serial.print(" y la del segundo es: ");
 Serial.print(distancia2);
 Serial.print(" y la presion es: ");
 Serial.println(fuerza);*/
 delay(500);

if(distancia1 > 100)
{
  //si es mayor debo mandar un error
  Serial.println("Error: medicion sobrepasa el 100% en el primer sensor");
}
else
{
  // aca significa que es menor, darle el porcentaje
  Serial.print("Primer sensor: ");
  Serial.print(distancia1);
  Serial.println("%");
}
if(distancia2 > 100)
{
  //si es mayor debo mandar un error
  Serial.println("Error: medicion sobrepasa el 100% en el segundo sensor");
  Serial.println("*********************************************************");
  delay(1000);
}
else
{
  // aca significa que es menor, darle el porcentaje
  Serial.print("Segundo sensor: ");
  Serial.print(distancia2);
  Serial.println("%");
  Serial.println("*********************************************************");
  delay(1000);
}
/* if (distancia1>20)
 {
    digitalWrite(led, HIGH);
 }
 else
 {
    digitalWrite(led, LOW);
 }
 if(distancia2>20)
 {
    digitalWrite(led2, HIGH);
 }
 else
 {
    digitalWrite(led2, LOW);
 }*/
}

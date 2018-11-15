#include <HCSR04.h>

HCSR04 sensor(5,4); // (PIN Trigger, PIN Echo)
int led = 18;

void setup()
{
  pinMode(led, OUTPUT);
  Serial.begin(115200);
  Serial.write("inicio");
}


void loop()
{
 float distancia1;
 distancia1 = sensor.dist();
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

 if (distancia1>50)
 {
    digitalWrite(led, HIGH);
 }
 else
 {
    digitalWrite(led, LOW);
 }
}

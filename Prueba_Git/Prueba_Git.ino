int pressurePin = A0;
int force;
int LEDpin = 12;
void setup() {
Serial.begin(9600);
pinMode(LEDpin, OUTPUT);
}
void loop() {
  force = analogRead(pressurePin);
  force = map(force, 0, 1023, 0, 10000);
  Serial.println(force);
if(force > 5000)
{
  digitalWrite(LEDpin, HIGH);
}
else
{
  digitalWrite(LEDpin, LOW);
}
delay(100);
}



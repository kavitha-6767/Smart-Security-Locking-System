#include <SoftwareSerial.h> 
#include <Servo.h> 

Servo myServo; 
int TxD = 11;
in t RxD = 10; 
int servoposition; 
int servopos; 
int new1; 

SoftwareSerial bluetooth(TxD, RxD); 
void setup() {
int pos=0; 
myServo.attach(9); 
myServo.write(0); 
Serial.begin(9600); 
bluetooth.begin(9600); 
} 
void loop() 
{ 
if (bluetooth.available()) 
} 


#include <SoftwareSerial.h> 
#include <Servo.h> 
Servo myServo; 
int TxD = 11;
int RxD = 10; 
int servoposition; 
int servopos; 
int new1; 

SoftwareSerial bluetooth(TxD, RxD); 
void setup() { 
int pos=0; 
myServo.attach(9); 
myServo.write(0); 
Serial.begin(9600); 
bluetooth.begin(9600); 
} 
void loop() { 
if (bluetooth.available()) 
} 

Serial.println(servoposition); 
myServo.write(180); 
} 
while(value.toInt()==1) 
{ 
if 
(bluetooth.available()) 
{ 

value = bluetooth.readString(); 
Serial.println(value); 
if 
(value.toInt()==2) { 
Serial.println("YYY"); 
break; 
} 
} 
servopos++; delay(30); 
Serial.println(servopos); 
myServo.write(servopos); 
if (servopos ==180 ) { 
servopos=0; break; 
} 
} 
} 
}
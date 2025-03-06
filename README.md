# Shape Calculation Program

## Overview
This Java program is a **menu-driven application** that allows users to calculate the **area, perimeter, and volume** of various geometric shapes. It follows an **Object-Oriented Programming (OOP)** approach by using an **abstract class (`Shape`)**, an **interface (`Volume`)**, and individual classes for different shapes.

## Features
- Supports **2D shapes**: Circle, Rectangle, and Square.
- Supports **3D shapes**: Sphere, Cylinder, and Equilateral Pyramid (Square Base).
- Uses an **abstract class (`Shape`)** for common properties and methods.
- Implements a **`Volume` interface** for 3D shapes.
- Uses a **menu-driven approach** for user input.
- Follows proper **coding guidelines and comments** for clarity.

## Classes for Shapes
| Shape                 | Parent Class / Interface | Methods Implemented |
|----------------------|------------------------|--------------------|
| `Circle`            | `Shape`                | `calculateArea()`, `calculatePerimeter()` |
| `Rectangle`         | `Shape`                | `calculateArea()`, `calculatePerimeter()` |
| `Square`            | `Shape`                | `calculateArea()`, `calculatePerimeter()` |
| `Sphere`            | `Shape`, `Volume`      | `calculateArea()`, `calculateVolume()` |
| `Cylinder`          | `Shape`, `Volume`      | `calculateArea()`, `calculateVolume()` |
| `EquilateralPyramid` | `Shape`, `Volume`      | `calculateArea()`, `calculateVolume()` |

## Usage
1. Clone this repository:
   ```sh
   git clone https://github.com/dishagupta-26/Shape-PIJ.git 
   ```

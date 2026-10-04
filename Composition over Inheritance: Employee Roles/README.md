
Problem

You are given a broken design where Manager extends Employee extends Person — a deep 3-level hierarchy. The problem: a Contractor also needs some Manager capabilities but isn't a full-time employee. Refactor it to use composition and interfaces so roles are mix-and-matchable without inheritance chains.

Requirements

Define interfaces: Payable, Manageable, Reportable
Employee implements Payable + Reportable
Manager implements Payable + Manageable + Reportable
Contractor implements Payable only (no benefits, no direct reports)
Each class composes behaviour through injected services, not by inheriting from base classes
Show why Contractor extends Manager would be wrong
Constraints

–
Max 1 level of class inheritance allowed
–
Shared logic (e.g. tax calculation) must live in a reusable service, not a base class

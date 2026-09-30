# NEXA CRM - SaaS for Aesthetic Clinics

## What is NEXA?
NEXA is a SaaS platform for aesthetic clinics in Brazil to manage clients, services, appointments and marketing retention. Focus on returning inactive clients.

## Multi-tenant Strategy
We use shared database, shared schema approach. All tables have `clinic_id` as foreign key to isolate data per clinic.
Why? Low cost for MVP and secure if we always use WHERE clinic_id.

## Tech Stack
- Java 21 + Spring Boot 4.0.7
- PostgreSQL 16.11
- JPA / Hibernate / Lombok
- Architecture: REST API

## Current Status
- Project running with PostgreSQL
- Services table working (2 records saved)
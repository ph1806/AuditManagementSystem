import React, { useState, useEffect } from 'react'
import { Container, Form, Button, Row, Col,Spinner } from 'react-bootstrap';
import axios from 'axios'
export default function CheckList() {
 
  
  const handleSubmit1 = (e) => {
  
  };

  const handleSubmit = (e) => {
  };


  return (
    <div >

      <Container className="mt-3 text-center">
        <Form onSubmit={handleSubmit}>
          <Row>
            <Col sm={1}></Col>
            <Col sm={3}>
              <Form.Label>Choose Audit type:</Form.Label>
            </Col>
            <Col sm={3}>
              <Form.Group className="mb-3" controlId="Slot">

                <Form.Select aria-label="Default select example" onChange={(e) => {
                  //setType(e.target.value)
                  //setsearch(e.target.value)
                }}>
                  <option>Select Audit Type</option>
                  <option value="Internal">Internal</option>
                  <option value="SOX">SOX</option>

                </Form.Select>
              </Form.Group>
            </Col>
            <Col sm={3}>
              <Button type="submit" variant="outline-success">See Questions</Button>
            </Col>
            <Col sm={2}></Col>
          </Row>
        </Form>
      </Container>

          
    </div>

  )
}
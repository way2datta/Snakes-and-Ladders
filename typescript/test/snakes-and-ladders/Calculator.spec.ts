import Calculator from "../../src/snakes-and-ladders/Calculator";

describe("Calculator", () => {
    it("should add two numbers", () => {
        expect(Calculator.add(4,5)).toEqual(9);
    });
});
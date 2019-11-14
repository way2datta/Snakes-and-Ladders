import { expect } from "chai";
import Calculator from "./Calculator";
describe("Inline Calculator", () => {
    describe("#add", () => {
        it("should return addition of two operands", () => {
            // Arrange
            const operand1 = 23;
            const operand2 = 56;

            // Act
            const addition = Calculator.add(operand1, operand2);

            // Assert
            expect(addition).to.be.equal(79);
        });
    });
});
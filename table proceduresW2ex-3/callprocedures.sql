-- Call scenario 1
BEGIN
  ProcessMonthlyInterest;
END;
/

-- Call scenario 2
BEGIN
  UpdateEmployeeBonus(101, 10); -- department 101, 10% bonus
END;
/

-- Call scenario 3
BEGIN
  TransferFunds(1, 2, 500); -- from account 1 to 2, amount 500
END;
/

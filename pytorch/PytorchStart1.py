from __future__ import print_function
import torch
import numpy as np

x = torch.empty(5, 3)
print(x)

x = torch.rand(5, 3)
print(x)

x = torch.zeros(5, 3, dtype=torch.float)
print(x)

x = torch.tensor([5.5, 6], dtype=torch.double)
print(x)

x = x.new_ones(5, 3, dtype=torch.int)
print(x)

#x = torch.randn_like(x, dtype=torch.float)
print(x.size())

y = torch.ones(5, 3)
print(y)
print(x + y)
print(torch.add(x, y))
print(y.add_(x))
print(y[:, 1])

x = torch.randn(4, 4)
y = x.view(16)
print(y)
z = x.view(-1, 8)
print(z)


x = torch.randn(1)
print(x)
print(x.item())

a = torch.ones(5)
print(a)

b1 = np.array(a)
b = a.numpy()
print(np.array(b))
print(b)

print(np.array([2,3]))

print([1, 2, 4])
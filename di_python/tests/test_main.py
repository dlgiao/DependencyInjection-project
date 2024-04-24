import io
import sys

import pytest

from main import create_mas_service, create_hr_service


def run_test(test_function, expected_output):
    """Run a test for a given function."""
    with io.StringIO() as out:
        sys.stdout = out
        test_function()
        output = out.getvalue()
        assert output == expected_output


def test_create_mas_service():
    """Test the MAS implementation."""
    expected_output = ('*** Easy jog speed by MAS ***\n'
                       'Service computes 70% of MAS\n'
                       'Data source provides a MAS 17.5km/h\n'
                       'Compute easy jog by MAS: 12.25 km/h\n'
                       '*** End ***\n')

    run_test(create_mas_service, expected_output)


def test_create_hr_service():
    """Test the HR implementation."""
    expected_output = ('*** Easy jog by HR ***\n'
                       'Service computes 75% of max heart rate\n'
                       'Data source provides a max heart rate 185bpm\n'
                       'Compute easy jog by HR: 138.75 bpm\n'
                       '*** End ***\n')

    run_test(create_hr_service, expected_output)


if __name__ == "__main__":
    pytest.main([__file__])

package com.audamob.zwaz.view.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

import com.audamob.zwaz.R;

public class CustomRelativeLayout extends RelativeLayout implements
		OnClickListener {
	Context context;
	private boolean topMarqued;
	private boolean bottomMarqued;
	private boolean leftMarqued;
	private boolean rightMarqued;
	private boolean hasRightElement;
	private boolean hasLeftElement;
	private boolean hasBottomtElement;
	private boolean hasTopElement;
	private RelativeLayout topLine;
	private RelativeLayout bottomLine;
	private RelativeLayout leftLine;
	private RelativeLayout rightLine;

	private boolean checked;

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public boolean isTopMarqued() {
		return topMarqued;
	}

	public void setTopMarqued(boolean topMarqued) {
		this.topMarqued = topMarqued;
	}

	public boolean isBottomMarqued() {
		return bottomMarqued;
	}

	public void setBottomMarqued(boolean bottomMarqued) {
		this.bottomMarqued = bottomMarqued;
	}

	public boolean isLeftMarqued() {
		return leftMarqued;
	}

	public void setLeftMarqued(boolean leftMarqued) {
		this.leftMarqued = leftMarqued;
	}

	public boolean isRightMarqued() {
		return rightMarqued;
	}

	public void setRightMarqued(boolean rightMarqued) {
		this.rightMarqued = rightMarqued;
	}

	public boolean isHasRightElement() {
		return hasRightElement;
	}

	public void setHasRightElement(boolean hasRightElement) {
		this.hasRightElement = hasRightElement;
	}

	public boolean isHasLeftElement() {
		return hasLeftElement;
	}

	public void setHasLeftElement(boolean hasLeftElement) {
		this.hasLeftElement = hasLeftElement;
	}

	public boolean isHasBottomtElement() {
		return hasBottomtElement;
	}

	public void setHasBottomtElement(boolean hasBottomtElement) {
		this.hasBottomtElement = hasBottomtElement;
	}

	public boolean isHasTopElement() {
		return hasTopElement;
	}

	public void setHasTopElement(boolean hasTopElement) {
		this.hasTopElement = hasTopElement;
	}

	public RelativeLayout getTopLine() {
		return topLine;
	}

	public void setTopLine(RelativeLayout topLine) {
		this.topLine = topLine;
	}

	public RelativeLayout getBottomLine() {
		return bottomLine;
	}

	public void setBottomLine(RelativeLayout bottomLine) {
		this.bottomLine = bottomLine;
	}

	public RelativeLayout getLeftLine() {
		return leftLine;
	}

	public void setLeftLine(RelativeLayout leftLine) {
		this.leftLine = leftLine;
	}

	public RelativeLayout getRightLine() {
		return rightLine;
	}

	public void setRightLine(RelativeLayout rightLine) {
		this.rightLine = rightLine;
	}

	public CustomRelativeLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.context=context;
		View v = LayoutInflater.from(context).inflate(
				R.layout.custom_relative_layout, this, true);

		this.topLine = (RelativeLayout) v.findViewById(R.id.top);
		this.bottomLine = (RelativeLayout) v.findViewById(R.id.bottom);
		this.leftLine = (RelativeLayout) v.findViewById(R.id.left);
		this.rightLine = (RelativeLayout) v.findViewById(R.id.right);
		topLine.setOnClickListener(this);
		bottomLine.setOnClickListener(this);
		leftLine.setOnClickListener(this);
		rightLine.setOnClickListener(this);
		

	}

	public void checkAllItem() {
		if (topMarqued && leftMarqued && rightMarqued && bottomMarqued) {
			setBackgroundColor(getResources().getColor(R.color.flat_asbestos));
			checked = true;

		}
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.top:
			topMarqued=true;
			v.setBackgroundColor(context.getResources().getColor(R.color.flat_amethyst));
			checkAllItem();
			break;
		case R.id.bottom:
			bottomMarqued=true;
			v.setBackgroundColor(context.getResources().getColor(R.color.flat_amethyst));
			checkAllItem();
			break;
		case R.id.left:
			leftMarqued=true;
			v.setBackgroundColor(context.getResources().getColor(R.color.flat_amethyst));
			checkAllItem();
			break;
		case R.id.right:
			rightMarqued=true;
			v.setBackgroundColor(context.getResources().getColor(R.color.flat_amethyst));
			checkAllItem();
			break;

		default:
			break;
		}
	}

}
